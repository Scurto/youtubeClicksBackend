package com.scurto.controller;

import com.scurto.model.Website;
import com.scurto.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/statistics")
@CrossOrigin
public class StatisticsController {

    @Autowired
    private StatisticsService service;

    @RequestMapping(value = "/listWebsites", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Website> getWebsites() {
        try {
            ArrayList<Website> webSiteList = (ArrayList<Website>) service.getWebsites();
            return webSiteList;
        } catch (Exception ex) {
            return null;
        }
    }
}
