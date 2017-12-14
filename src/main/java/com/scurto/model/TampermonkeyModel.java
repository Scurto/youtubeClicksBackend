package com.scurto.model;

/**
 * Created by scurto on 13.12.2017.
 */
public class TampermonkeyModel {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TampermonkeyModel{" +
                "url='" + url + '\'' +
                '}';
    }
}
