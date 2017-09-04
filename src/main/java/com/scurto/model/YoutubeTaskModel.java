package com.scurto.model;

/**
 * Created by scurto on 05.09.2017.
 */
public class YoutubeTaskModel {

    private String taskId;
    private String countOfVideo;
    private String countOfReklama;
    private String countOfMove;
    private String prevDate;
    private String prevReklama;

    public YoutubeTaskModel(String taskId, String countOfVideo, String countOfReklama, String countOfMove, String prevDate, String prevReklama) {
        this.taskId = taskId;
        this.countOfVideo = countOfVideo;
        this.countOfReklama = countOfReklama;
        this.countOfMove = countOfMove;
        this.prevDate = prevDate;
        this.prevReklama = prevReklama;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCountOfVideo() {
        return countOfVideo;
    }

    public void setCountOfVideo(String countOfVideo) {
        this.countOfVideo = countOfVideo;
    }

    public String getCountOfReklama() {
        return countOfReklama;
    }

    public void setCountOfReklama(String countOfReklama) {
        this.countOfReklama = countOfReklama;
    }

    public String getCountOfMove() {
        return countOfMove;
    }

    public void setCountOfMove(String countOfMove) {
        this.countOfMove = countOfMove;
    }

    public String getPrevDate() {
        return prevDate;
    }

    public void setPrevDate(String prevDate) {
        this.prevDate = prevDate;
    }

    public String getPrevReklama() {
        return prevReklama;
    }

    public void setPrevReklama(String prevReklama) {
        this.prevReklama = prevReklama;
    }
}
