package com.scurto.controller;

import com.scurto.model.ReklamaModel;
import com.scurto.model.TaskDTO;
import com.scurto.model.TransferReklamaModel;
import com.scurto.model.Youtube;
import com.scurto.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<TransferReklamaModel> getReklamaListForShow(@RequestBody TaskDTO taskDto) {
        try {
            List<TransferReklamaModel> youtubeList = service.prepareReklamaListToShow(taskDto.getTaskId(), taskDto.getCountOfReklama(), taskDto.getCountOfMove());
            return youtubeList;
        } catch (Exception ex) {
            return null;
        }
    }
}
