package com.scurto.model;

public class TaskSiteDTO {
    private String taskId;
    private String countOfAdvertise;
    private String countOfMove;
    private String countOfUrls;
    private String oneTimeSiteUrl;
    private String lastAdvertise;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCountOfAdvertise() {
        return countOfAdvertise;
    }

    public void setCountOfAdvertise(String countOfAdvertise) {
        this.countOfAdvertise = countOfAdvertise;
    }

    public String getCountOfMove() {
        return countOfMove;
    }

    public void setCountOfMove(String countOfMove) {
        this.countOfMove = countOfMove;
    }

    public String getCountOfUrls() {
        return countOfUrls;
    }

    public void setCountOfUrls(String countOfUrls) {
        this.countOfUrls = countOfUrls;
    }

    public String getOneTimeSiteUrl() {
        return oneTimeSiteUrl;
    }

    public void setOneTimeSiteUrl(String oneTimeSiteUrl) {
        this.oneTimeSiteUrl = oneTimeSiteUrl;
    }

    public String getLastAdvertise() {
        return lastAdvertise;
    }

    public void setLastAdvertise(String lastAdvertise) {
        this.lastAdvertise = lastAdvertise;
    }
}
