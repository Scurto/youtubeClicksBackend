package com.scurto.model.advertise;

import java.util.ArrayList;

/**
 * Created by yustymenko on 13.10.2017.
 */
public class TransferReklamaModel {

    private String gclidLine;
    private ArrayList<String> textLine;

    public String getGclidLine() {
        return gclidLine;
    }

    public void setGclidLine(String gclidLine) {
        this.gclidLine = gclidLine;
    }

    public ArrayList<String> getTextLine() {
        return textLine;
    }

    public void setTextLine(ArrayList<String> textLine) {
        this.textLine = textLine;
    }
}
