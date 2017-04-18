package com.scurto.service;

import com.scurto.model.SiteDto;
import com.scurto.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scurto on 10.04.2017.
 */
@Service
public class MyService {

    private static List<TestModel> items = new ArrayList<>();

    @Autowired
    GetJsonFromUrlClient client;

    static {
       items.add(new TestModel("id1", "name1", "age1", "description1"));
       items.add(new TestModel("id2", "name2", "age2", "description2"));
    }
    public List<TestModel> findAllHardcoded() {
        return items;
    }

    public List<SiteDto> getJsonFromUrl() {
        return client.getJsonFromUrl();
    }
}
