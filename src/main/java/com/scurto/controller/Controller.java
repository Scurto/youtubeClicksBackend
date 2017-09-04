package com.scurto.controller;

import com.scurto.model.*;
import com.scurto.service.MyService;
import com.scurto.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by scurto on 10.04.2017.
 */
@CrossOrigin
@RestController
public class Controller {

//    @Autowired
//    private MyService testService;

    @Autowired
    private YoutubeService youtubeService;

//    @RequestMapping("/api/test")
//    public List<TestModel> getModelList() {
//        return testService.findAllHardcoded();
//    }
//
//    @RequestMapping("/api/test2")
//    public List<SiteDto> getJsonFromUrl() {
//        return testService.getJsonFromUrl();
//    }

    @RequestMapping(value = "/getTaskModel", method={ RequestMethod.POST })
    public YoutubeTaskModel getTaskModelById(@RequestBody YoutubeTaskId youtubeTask) {
        System.out.println("taskId = " + youtubeTask.getTaskId());
        return youtubeService.getModel(youtubeTask.getTaskId());
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public ResponseEntity register(@RequestBody RegisterDto registerDto) {
//        System.out.println(registerDto);
//
//        if (registerDto.getPassword().equals("1234")) {
//            return new ResponseEntity(HttpStatus.OK);
//        } else {
//            return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//    }
}
