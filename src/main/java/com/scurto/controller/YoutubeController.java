package com.scurto.controller;

import com.scurto.model.TaskDTO;
import com.scurto.model.TransferModel;
import com.scurto.model.TransferReklamaModel;
import com.scurto.model.Youtube;
import com.scurto.model.YoutubeApiModel.YoutubeVideoList;
import com.scurto.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by yustymenko on 12.10.2017.
 */
@RestController
@RequestMapping(value = "/youtube")
@CrossOrigin
public class YoutubeController {

    @Autowired
    private YoutubeService service;

    @RequestMapping(value = "/allYoutubeTasks")
    @ResponseBody
    public List<Youtube> getAllYoutubeTasks() {
        try {
            List<Youtube> youtubeList = service.getAllYoutubeTasks();
            return youtubeList;
        } catch (Exception ex) {
            return null;
        }
    }


    @RequestMapping(value = "/reklamaListForRemove")
    @ResponseBody
    public List<Youtube> getReklamaListForRemove() {
        try {
            List<Youtube> youtubeList = service.getReklamaListForRemove("1");
            return youtubeList;
        } catch (Exception ex) {
            return null;
        }
    }



    @RequestMapping(value = "/reklamaListForShow", method = RequestMethod.POST)
    @ResponseBody
    public TransferModel getReklamaListForShow(@RequestBody TaskDTO taskDto) {
        TransferModel transferModel = new TransferModel();
        try {
            YoutubeVideoList videoList = getYoutubeVideoList("");
            ArrayList<String> prpearedVideoList = prepareVideoList(videoList, Integer.parseInt(taskDto.getCountOfVideo()));
            ArrayList<TransferReklamaModel> youtubeList = service.prepareReklamaListToShow(taskDto.getTaskId(), taskDto.getCountOfReklama(), taskDto.getCountOfMove());
            transferModel.setTransferReklamaModel(youtubeList);
            transferModel.setTransferVideoModel(prpearedVideoList);

            return transferModel;
        } catch (Exception ex) {
            return null;
        }
    }

    private ArrayList<String> prepareVideoList(YoutubeVideoList videoList, int listSize) {
        ArrayList<String> startVideoList = new ArrayList<>();
        ArrayList<String> prpearedVideoList = new ArrayList<>();

        int size = (videoList.getPageInfo().getTotalResults() > 11 ? 12 : videoList.getItems().size());

        for(int i = 0; i < size; i++) {
            startVideoList.add(videoList.getItems().get(i).getId().getVideoId());
        }

        Random rnd = new Random();
        for (int i = 0; i < listSize; i++) {
            String unigKey = startVideoList.get(rnd.nextInt(startVideoList.size()));
            startVideoList.remove(unigKey);
            prpearedVideoList.add(unigKey);
        }

        return prpearedVideoList;
    }

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    YoutubeVideoList getYoutubeVideoList(String chanelId) {
        String transactionUrl = "https://www.googleapis.com/youtube/v3/search";
        chanelId = "UCJIbnmV8DdqOGEcl6hm-x8w";
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(transactionUrl)
                // Add query parameter
                .queryParam("part", "snippet")
                .queryParam("channelId", chanelId)
                .queryParam("maxResults", "50")
                .queryParam("order", "date")
                .queryParam("key", "AIzaSyD4uG1sdLHryZMwVDnUQBXXIdvGhAtGquA");

        RestTemplate restTemplate = new RestTemplate();
        YoutubeVideoList youtubeVideoList = restTemplate.getForObject(builder.toUriString(), YoutubeVideoList.class);
        return youtubeVideoList;
    }
}
