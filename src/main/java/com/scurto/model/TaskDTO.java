package com.scurto.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by scurto on 13.10.2017.
 */
public class TaskDTO implements Serializable {

    public TaskDTO() {
    }

    private String taskId;
    private String countOfReklama;
    private String countOfMove;
    private String countOfVideo;
    private ArrayList<String> listOfVideo;
    private String lastReklama;
    private String oneTimeChanelUrl;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
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

    public String getCountOfVideo() {
        return countOfVideo;
    }

    public void setCountOfVideo(String countOfVideo) {
        this.countOfVideo = countOfVideo;
    }

    public ArrayList<String> getListOfVideo() {
        return listOfVideo;
    }

    public void setListOfVideo(ArrayList<String> listOfVideo) {
        this.listOfVideo = listOfVideo;
    }

    public String getLastReklama() {
        return lastReklama;
    }

    public void setLastReklama(String lastReklama) {
        this.lastReklama = lastReklama;
    }

    public String getOneTimeChanelUrl() {
        return oneTimeChanelUrl;
    }

    public void setOneTimeChanelUrl(String oneTimeChanelUrl) {
        this.oneTimeChanelUrl = oneTimeChanelUrl;
    }
}
