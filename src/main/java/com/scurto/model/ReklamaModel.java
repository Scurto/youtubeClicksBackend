package com.scurto.model;

import java.util.ArrayList;

/**
 * Created by yustymenko on 13.10.2017.
 */
public class ReklamaModel {

    private String mainUrl;
    private String id;
    private String type;
    private String location;
    private String source;
    private ArrayList<SecondaryReklamaModel> secondaryReklamaModels;

    public ReklamaModel() {
    }

    public ReklamaModel(String mainUrl, String id, String type, String location, String source, ArrayList<SecondaryReklamaModel> secondaryReklamaModels) {
        this.mainUrl = mainUrl;
        this.id = id;
        this.type = type;
        this.location = location;
        this.source = source;
        this.secondaryReklamaModels = secondaryReklamaModels;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ArrayList<SecondaryReklamaModel> getSecondaryReklamaModels() {
        return secondaryReklamaModels;
    }

    public void setSecondaryReklamaModels(ArrayList<SecondaryReklamaModel> secondaryReklamaModels) {
        this.secondaryReklamaModels = secondaryReklamaModels;
    }
}



enum Location {
    UA("ua"),
    RU("ru");

    Location(String key) {
        this.key = key;
    }

    private final String key;

    public String getKey() {
        return key;
    }
}

enum Type {
    REKLAMA("reklama");

    Type(String key) {
        this.key = key;
    }

    private final String key;

    public String getKey() {
        return key;
    }
}
