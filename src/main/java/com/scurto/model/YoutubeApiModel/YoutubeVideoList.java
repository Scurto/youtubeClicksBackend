package com.scurto.model.YoutubeApiModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by scurto on 16.10.2017.
 */
public class YoutubeVideoList implements Serializable {
    private String etag;
    private ArrayList<YoutubeVideoModel> items;
    private String kind;
    private PageInfo pageInfo;


    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ArrayList<YoutubeVideoModel> getItems() {
        return items;
    }

    public void setItems(ArrayList<YoutubeVideoModel> items) {
        this.items = items;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}