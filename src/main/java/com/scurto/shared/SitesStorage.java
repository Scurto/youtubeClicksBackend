package com.scurto.shared;

import com.scurto.model.SiteModel;

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
                "http://detskie-recepty.ru",
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
        siteModels.put("1", model(
                "1",
                10,
                10,
                "3",
                "3",
                null,
                "testTaskOwner",
                "http://fitfb.ru/",
                "4",
                null
        ));
        siteModels.put("1794419", model(
                "1794419",
                30,
                30,
                "0",
                "0",
                null,
                "9950949 - Artyom",
                "https://mysnova.ru/",
                "6",
                null
        ));
        siteModels.put("1641652", model(
                "1641652",
                30,
                30,
                "0",
                "0",
                null,
                "9950949 - Artyom",
                "http://sunsang.ru/",
                "6",
                null
        ));
        siteModels.put("1674967", model(
                "1674967",
                30,
                30,
                "0",
                "0",
                null,
                "9950949 - Artyom",
                "https://googs.ru/",
                "6",
                null
        ));
        siteModels.put("1794416", model(
                "1794416",
                40,
                40,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "https://mysnova.ru/",
                "5",
                null
        ));

        siteModels.put("1682975", model(
                "1682975",
                40,
                40,
                "1",
                "4",
                null,
                "10603708 - Areq",
                "http://junjo.ru/",
                "5",
                null
        ));

        siteModels.put("1647364", model(
                "1647364",
                40,
                40,
                "0",
                "4",
                null,
                "10603708 - Areq",
                "https://ooaoo.ru/",
                "6",
                null
        ));

        siteModels.put("1622180", model(
                "1622180",
                40,
                40,
                "0",
                "4",
                null,
                "7017738 - Vedun",
                "http://fitfb.ru/",
                "6",
                null
        ));

        siteModels.put("1719387", model(
                "1719387",
                40,
                40,
                "0",
                "4",
                null,
                "11026159 - Edoooo",
                "http://gvenik.ru/",
                "6",
                null
        ));
        siteModels.put("1717671", model(
                "1717671",
                40,
                40,
                "0",
                "4",
                null,
                "11026159 - Edoooo",
                "http://poxik.ru/",
                "6",
                null
        ));
        siteModels.put("1717668", model(
                "1717668",
                40,
                40,
                "0",
                "4",
                null,
                "11026159 - Edoooo",
                "http://paypey.ru/",
                "6",
                null
        ));

        siteModels.put("1660674", model(
                "1660674",
                40,
                40,
                "0",
                "4",
                null,
                "6615828 - Ivan",
                "http://sunsee.info/",
                "8",
                null
        ));
        siteModels.put("1660669", model(
                "1660669",
                40,
                40,
                "0",
                "4",
                null,
                "6615828 - Ivan",
                "https://vidzo.me/",
                "8",
                null
        ));
        siteModels.put("1548087", model(
                "1548087",
                40,
                40,
                "0",
                "4",
                null,
                "10199054 - Semir",
                "http://neoguru.ru/",
                "6",
                null
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
