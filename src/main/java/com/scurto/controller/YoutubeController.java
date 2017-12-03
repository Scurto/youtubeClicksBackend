package com.scurto.controller;

import com.scurto.model.*;
import com.scurto.model.YoutubeApiModel.*;
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

    @RequestMapping(value = "/listAllTaskModel", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<TaskModel> getListYoutubeTasksId() {
        try {
            ArrayList<TaskModel> listYoutubeTasksId = ChanelIdStorage.getAllTaskModelArray();
            return listYoutubeTasksId;
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
            String chanelId = ChanelIdStorage.getChanelId(taskDto.getTaskId());
            transferModel.setTransferChanelId(chanelId);
            YoutubeVideoList videoList = getYoutubeVideoList(chanelId);
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
            String chanelId = ChanelIdStorage.getChanelId(taskDto.getTaskId());
            transferModel.setTransferChanelId(chanelId);

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
            Random rnd = new Random();
            StringBuilder defUrl= new StringBuilder("?utm_term=" + rnd.nextInt(999999999));

            ArrayList<String> gclidUriAttributes = new ArrayList<>();
            gclidUriAttributes.add("&utm_medium=gdn");
            gclidUriAttributes.add("&utm_source=awo");
            gclidUriAttributes.add("&utm_content=google");
            gclidUriAttributes.add("&utm_campaign=" + rnd.nextInt(999999999));
            gclidUriAttributes.add("&utm_medium=display");
            gclidUriAttributes.add("&promo=" + rnd.nextInt(999999999));

            for (String uriAttribute : gclidUriAttributes) {
                if (Math.round(Math.random()) > 0) {
                    defUrl.append(uriAttribute);
                }
            }

            defUrl.append("&gclid=");

            System.out.println(defUrl);
            return defUrl.toString();
//            return service.getGclid();
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

            service.updateTask(taskDto.getTaskId(), taskDto.getLastReklama());
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

//        int size = (videoList.getPageInfo().getTotalResults() > 11 ? 12 : videoList.getItems().size());
        int size = videoList.getItems().size();

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
    YoutubeVideoList getYoutubeVideoList(String fullChanelId) {
        String id = "";

        String[] split = fullChanelId.split("/");
        if (split[0].equalsIgnoreCase("user")) {
            UriComponentsBuilder builder1 = UriComponentsBuilder
                    .fromUriString("https://www.googleapis.com/youtube/v3/channels")
                    // Add query parameter
                    .queryParam("part", "contentDetails")
                    .queryParam("forUsername", split[1])
                    .queryParam("maxResults", "50")
                    .queryParam("order", "date")
                    .queryParam("key", "AIzaSyD4uG1sdLHryZMwVDnUQBXXIdvGhAtGquA");

            RestTemplate restTemplate1 = new RestTemplate();
            YoutubeVideoListByUserName youtubeVideoList1 = restTemplate1.getForObject(builder1.toUriString(), YoutubeVideoListByUserName.class);

            if (youtubeVideoList1.getItems() != null && youtubeVideoList1.getItems().size() > 0) {
                id = youtubeVideoList1.getItems().get(0).getId();
            }
        } else {
            id = split[1];
        }


        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString("https://www.googleapis.com/youtube/v3/search")
                // Add query parameter
                .queryParam("part", "snippet")
                .queryParam("channelId", id)
                .queryParam("maxResults", "20")
                .queryParam("order", "date")
                .queryParam("key", "AIzaSyD4uG1sdLHryZMwVDnUQBXXIdvGhAtGquA");

        RestTemplate restTemplate = new RestTemplate();
        YoutubeVideoList youtubeVideoList = restTemplate.getForObject(builder.toUriString(), YoutubeVideoList.class);
        return youtubeVideoList;
    }
}
