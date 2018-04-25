package com.scurto.controller;

import com.scurto.model.SiteModel;
import com.scurto.model.TaskDTO;
import com.scurto.model.TaskSiteDTO;
import com.scurto.model.TransferModel;
import com.scurto.model.advertise.AutoCloseAdvertiseModel;
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
    public ArrayList<String> getListSiteUrls(@RequestBody SiteModel model) {
        ArrayList<String> listWebSiteUrls = new ArrayList<>();
        if (!model.isUseSecondaryUrls()) {
            listWebSiteUrls.addAll(WebSiteParser.getParsedUrlsFromWebSite(model.getMainUrl(), model.isUseProxy()));
        } else {
            listWebSiteUrls.addAll(SitesStorage.getSiteModelById(model.getTaskId()).getSecondaryUrls());
        }

        return listWebSiteUrls;
    }

    @RequestMapping(value = "/decodeUrl", method = RequestMethod.POST)
    @ResponseBody
    public String decodeUrl(@RequestBody SiteModel model) {
        return WebSiteParser.decode(model.getMainUrl());
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
    public String isLinkActive(@RequestBody SiteModel model) {
        try {
            if (!model.isUseSecondaryUrls()) {
                return WebSiteParser.isActiveLink(model.getMainUrl(), model.isUseProxy()) ? "yes" : "no";
            } else {
                return "yes";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "no";
    }

    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    @ResponseBody
    public String updateTask(@RequestBody TaskSiteDTO taskDto) {
        try {
            System.out.println(taskDto.getTaskId());
            System.out.println(taskDto.getLastAdvertise());

            service.updateSiteTask(taskDto.getTaskId(), taskDto.getLastAdvertise());
            return "";
        } catch (Exception ex) {
            return null;
        }
    }

    private void prepareTransferModel(TaskSiteDTO taskDto, TransferModel transferModel) {
        TransferReklamaModelWrapper youtubeList = service.prepareReklamaListToShow(taskDto.getTaskId(), taskDto.getCountOfAdvertise(), taskDto.getCountOfMove(), taskDto.getOneTimeSiteUrl() != null);
        transferModel.setTransferReklamaModel(youtubeList.getTransferReklamaModels());
        transferModel.setTransferReklamaKeys(youtubeList.getTransferReklamaKeys());
    }

}
