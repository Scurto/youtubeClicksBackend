package com.scurto.model;

import java.util.ArrayList;

public class GclidRecall {
    private ArrayList<GclidCheckModel> gclidArray;
    private Long time;

    public ArrayList<GclidCheckModel> getGclidArray() {
        return gclidArray;
    }

    public void setGclidArray(ArrayList<GclidCheckModel> gclidArray) {
        this.gclidArray = gclidArray;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}


