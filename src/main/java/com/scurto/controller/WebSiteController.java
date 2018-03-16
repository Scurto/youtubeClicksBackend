package com.scurto.controller;

import com.scurto.model.SiteModel;
import com.scurto.model.TaskDTO;
import com.scurto.shared.SitesStorage;
import com.scurto.util.WebSiteParser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/website")
@CrossOrigin
public class WebSiteController {

    @RequestMapping(value = "/listAllSitesModel", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<SiteModel> getListYoutubeTasksId() {
        try {
            ArrayList<SiteModel> listWebSitesTasksId = SitesStorage.getAllSitesTaskModelArray();
            return listWebSitesTasksId;
        } catch (Exception ex) {
            return null;
        }
    }

    @RequestMapping(value = "/getListSiteUrls", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<String> getListSiteUrls(@RequestBody String websiteUrl) {
        ArrayList<String> listWebSiteUrls = WebSiteParser.getParsedUrlsFromWebSite(websiteUrl);
        return listWebSiteUrls;
    }
}
