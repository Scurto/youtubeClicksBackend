package com.scurto.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SitesStorage {

    public static ArrayList<SiteModel> getAllSitesTaskModelArray() {
        return new ArrayList<SiteModel>(getAllSitesModel().values());
    }

    public static HashMap<String, SiteModel> getAllSitesModel() {
        HashMap<String, SiteModel> siteModels = new HashMap<>();
        siteModels.put("0", model(
                "0",
                10,
                10,
                "3",
                "3",
                null,
                "testTaskOwner",
                "www.mainUrl.com",
                "7",
                createSecondaryUrls(
                        "www.mainUrl.com/aaa",
                        "www.mainUrl.com/bbb",
                        "www.mainUrl.com/ccc",
                        "www.mainUrl.com/ddd",
                        "www.mainUrl.com/eee",
                        "www.mainUrl.com/fff",
                        "www.mainUrl.com/ggg"
                )

        ));
        return siteModels;
    }

    private static SiteModel model(String taskId,
                                   Integer advertiseFreeze,
                                   Integer siteFreeze,
                                   String countAdvertise,
                                   String countAdvertiseMove,
                                   String strategy,
                                   String taskOwner,
                                   String mainUrl,
                                   String countSecondaryUrls,
                                   ArrayList<String> secondaryUrls
                                   ) {
        SiteModel model = new SiteModel();
        model.setTaskId(taskId);
        model.setCountSecondaryUrls(countSecondaryUrls);
        model.setAdvertiseFreeze(advertiseFreeze);
        model.setSiteFreeze(siteFreeze);
        model.setCountAdvertise(countAdvertise);
        model.setCountAdvertiseMove(countAdvertiseMove);
        model.setStrategy(strategy != null ? strategy : "classic");
        model.setTaskOwner(taskOwner);
        model.setMainUrl(mainUrl);
        model.setSecondaryUrls(secondaryUrls);
        return model;
    }

    private static ArrayList<String> createSecondaryUrls(String... elements) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(elements));
        return list;
    }
}
