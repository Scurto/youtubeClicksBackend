package com.scurto.model.YoutubeApiModel;

import java.io.Serializable;

/**
 * Created by scurto on 16.10.2017.
 */
public class YoutubeVideoModel implements Serializable {
    private String etag;
    private YoutubeVideoModelId id;
    private String kind;

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public YoutubeVideoModelId getId() {
        return id;
    }

    public void setId(YoutubeVideoModelId id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
