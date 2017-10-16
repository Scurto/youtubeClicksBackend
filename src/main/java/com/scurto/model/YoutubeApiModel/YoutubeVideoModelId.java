package com.scurto.model.YoutubeApiModel;

import java.io.Serializable;

/**
 * Created by scurto on 16.10.2017.
 */
public class YoutubeVideoModelId implements Serializable {
    private String kind;
    private String videoId;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
