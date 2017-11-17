package com.scurto.model.YoutubeApiModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by scurto on 17.11.2017.
 */
public class YoutubeVideoListByUserName implements Serializable {
    private String etag;
    private ArrayList<YoutubeVideoModelByUserName> items;
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

    public ArrayList<YoutubeVideoModelByUserName> getItems() {
        return items;
    }

    public void setItems(ArrayList<YoutubeVideoModelByUserName> items) {
        this.items = items;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
