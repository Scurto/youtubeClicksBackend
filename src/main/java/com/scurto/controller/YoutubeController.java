package com.scurto.controller;

import com.scurto.model.*;
import com.scurto.model.YoutubeApiModel.PageInfo;
import com.scurto.model.YoutubeApiModel.YoutubeVideoList;
import com.scurto.model.YoutubeApiModel.YoutubeVideoModel;
import com.scurto.model.YoutubeApiModel.YoutubeVideoModelId;
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
            prepareTransferModel(taskDto, transferModel, videoList);

            return transferModel;
        } catch (Exception ex) {
            return null;
        }
    }

    @RequestMapping(value = "/getMixedList", method = RequestMethod.POST)
    @ResponseBody
    public TransferModel getReklamaListForShowWithVideo(@RequestBody TaskDTO taskDto) {
        TransferModel transferModel = new TransferModel();
        try {
            YoutubeVideoList videoList = new YoutubeVideoList();
            ArrayList<YoutubeVideoModel> items = new ArrayList<>();
            for (String videoId : taskDto.getListOfVideo()) {
                items.add(new YoutubeVideoModel("", new YoutubeVideoModelId("", videoId), ""));
            }

            videoList.setItems(items);
            videoList.setPageInfo(new PageInfo(null, taskDto.getListOfVideo().size()));
            prepareTransferModel(taskDto, transferModel, videoList);

            return transferModel;
        } catch (Exception ex) {
            return null;
        }
    }

    @RequestMapping(value = "/getGClid", method = RequestMethod.GET)
    public String getGClid() {
        try {
            return service.getGclid();
        } catch (Exception ex) {
            return null;
        }
    }

    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    @ResponseBody
    public String updateTask(@RequestBody TaskDTO taskDto) {
        try {
            System.out.println(taskDto.getTaskId());
            System.out.println(taskDto.getLastReklama());
            return "";
        } catch (Exception ex) {
            return null;
        }
    }


    private void prepareTransferModel(@RequestBody TaskDTO taskDto, TransferModel transferModel, YoutubeVideoList videoList) {
        ArrayList<String> prpearedVideoList = prepareVideoList(videoList, Integer.parseInt(taskDto.getCountOfVideo()));
        TransferReklamaModelWrapper youtubeList = service.prepareReklamaListToShow(taskDto.getTaskId(), taskDto.getCountOfReklama(), taskDto.getCountOfMove());
        transferModel.setTransferReklamaModel(youtubeList.getTransferReklamaModels());
        transferModel.setTransferVideoModel(prpearedVideoList);
        transferModel.setTransferReklamaKeys(youtubeList.getTransferReklamaKeys());
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
            int anInt = rnd.nextInt(startVideoList.size()) + 1;
            String unigKey = startVideoList.get(anInt);
            prpearedVideoList.add(unigKey);
            startVideoList.remove(unigKey);
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
