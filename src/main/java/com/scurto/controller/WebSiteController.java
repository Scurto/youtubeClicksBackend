package com.scurto.controller;

import com.scurto.model.SiteModel;
import com.scurto.model.TaskSiteDTO;
import com.scurto.model.TransferModel;
import com.scurto.model.advertise.TransferReklamaModelWrapper;
import com.scurto.service.YoutubeService;
import com.scurto.shared.SitesStorage;
import com.scurto.util.WebSiteParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/website")
@CrossOrigin
public class WebSiteController {

    @Autowired
    private YoutubeService service;

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

    @RequestMapping(value = "/advertiseListForSiteShow", method = RequestMethod.POST)
    @ResponseBody
    public TransferModel getReklamaListForShow(@RequestBody TaskSiteDTO taskDto) {
        TransferModel transferModel = new TransferModel();
        try {
            prepareTransferModel(taskDto, transferModel);
            return transferModel;
        } catch (Exception ex) {
            return null;
        }
    }

    @RequestMapping(value = "/isLinkActive", method = RequestMethod.POST)
    @ResponseBody
    public String isLinkActive(@RequestBody SiteModel url) {
        try {
            return WebSiteParser.isActiveLink(url.getMainUrl()) ? "yes" : "no";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "no";
    }

    private void prepareTransferModel(TaskSiteDTO taskDto, TransferModel transferModel) {
        TransferReklamaModelWrapper youtubeList = service.prepareReklamaListToShow(taskDto.getTaskId(), taskDto.getCountOfAdvertise(), taskDto.getCountOfMove(), taskDto.getOneTimeSiteUrl() != null);
        transferModel.setTransferReklamaModel(youtubeList.getTransferReklamaModels());
        transferModel.setTransferReklamaKeys(youtubeList.getTransferReklamaKeys());
    }
}
