package com.scurto.model;

/**
 * Created by scurto on 23.11.2017.
 */
public class TaskModel {
    private String taskId;
    private String countVideo;
    private String countReklama;
    private String countMove;
    private Integer reklamafreeze;
    private Integer videoFreeze;
    private String channelId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCountVideo() {
        return countVideo;
    }

    public void setCountVideo(String countVideo) {
        this.countVideo = countVideo;
    }

    public String getCountReklama() {
        return countReklama;
    }

    public void setCountReklama(String countReklama) {
        this.countReklama = countReklama;
    }

    public Integer getReklamafreeze() {
        return reklamafreeze;
    }

    public void setReklamafreeze(Integer reklamafreeze) {
        this.reklamafreeze = reklamafreeze;
    }

    public Integer getVideoFreeze() {
        return videoFreeze;
    }

    public void setVideoFreeze(Integer videoFreeze) {
        this.videoFreeze = videoFreeze;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getCountMove() {
        return countMove;
    }

    public void setCountMove(String countMove) {
        this.countMove = countMove;
    }
}
