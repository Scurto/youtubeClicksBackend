package com.scurto.model;

import java.time.LocalDateTime;

/**
 * Created by scurto on 13.02.2018.
 */
public class GclidStorageModel {

    private String gclid;
    private LocalDateTime time;

    public GclidStorageModel(String gclid, LocalDateTime time) {
        this.gclid = gclid;
        this.time = time;
    }

    public GclidStorageModel() {
    }

    public String getGclid() {
        return gclid;
    }

    public void setGclid(String gclid) {
        this.gclid = gclid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "GclidStorageModel{" +
                "gclid='" + gclid + '\'' +
                ", time=" + time +
                '}';
    }
}
