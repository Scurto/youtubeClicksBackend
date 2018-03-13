package com.scurto.model.advertise;

/**
 * Created by yustymenko on 13.10.2017.
 */
public class SecondaryReklamaModel {
    private String url;
    private String title;

    public SecondaryReklamaModel() {
    }

    public SecondaryReklamaModel(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecondaryReklamaModel that = (SecondaryReklamaModel) o;

        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}