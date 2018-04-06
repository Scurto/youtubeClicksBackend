package com.scurto.model;

import java.util.Date;

public class GclidCheckModel {
    String id;
    String gclidLink;
    Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGclidLink() {
        return gclidLink;
    }

    public void setGclidLink(String gclidLink) {
        this.gclidLink = gclidLink;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
