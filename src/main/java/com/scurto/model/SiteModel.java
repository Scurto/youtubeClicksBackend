package com.scurto.model;

import java.util.ArrayList;

public class SiteModel {
    private String taskId;
    private String mainUrl;
    private String countSecondaryUrls;
    private Integer advertiseFreeze;
    private Integer siteFreeze;
    private String strategy = "classic";
    private String taskOwner;
    private String countAdvertise;
    private String countAdvertiseMove;
    private ArrayList<String> secondaryUrls;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public Integer getAdvertiseFreeze() {
        return advertiseFreeze;
    }

    public void setAdvertiseFreeze(Integer advertiseFreeze) {
        this.advertiseFreeze = advertiseFreeze;
    }

    public Integer getSiteFreeze() {
        return siteFreeze;
    }

    public void setSiteFreeze(Integer siteFreeze) {
        this.siteFreeze = siteFreeze;
    }

    public String getCountSecondaryUrls() {
        return countSecondaryUrls;
    }

    public void setCountSecondaryUrls(String countSecondaryUrls) {
        this.countSecondaryUrls = countSecondaryUrls;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(String taskOwner) {
        this.taskOwner = taskOwner;
    }

    public String getCountAdvertise() {
        return countAdvertise;
    }

    public void setCountAdvertise(String countAdvertise) {
        this.countAdvertise = countAdvertise;
    }

    public String getCountAdvertiseMove() {
        return countAdvertiseMove;
    }

    public void setCountAdvertiseMove(String countAdvertiseMove) {
        this.countAdvertiseMove = countAdvertiseMove;
    }

    public ArrayList<String> getSecondaryUrls() {
        return secondaryUrls;
    }

    public void setSecondaryUrls(ArrayList<String> secondaryUrls) {
        this.secondaryUrls = secondaryUrls;
    }
}
