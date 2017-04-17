package com.model;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by scurto on 16.04.2017.
 */
@Component
public class SitesDtoList {
    private List<SiteDto> items;

    public List<SiteDto> getItems() {
        return items;
    }

    public void setItems(List<SiteDto> items) {
        this.items = items;
    }
}
