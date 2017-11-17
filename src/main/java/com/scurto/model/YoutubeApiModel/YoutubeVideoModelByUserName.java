package com.scurto.model.YoutubeApiModel;

import java.io.Serializable;

/**
 * Created by scurto on 17.11.2017.
 */
public class YoutubeVideoModelByUserName implements Serializable {
    private String etag;
    private String id;
    private String kind;

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
