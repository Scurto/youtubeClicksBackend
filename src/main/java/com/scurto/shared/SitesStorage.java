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
                "http://nirlen.ru",
                "4",
                null
        ));
        siteModels.put("1648314", model(
                "1648314",
                45,
                45,
                "0",
                "0",
                null,
                "10813496 - Genadi",
                "http://see-online.ru/",
                "6",
                null
        ));

        siteModels.put("1656028", model(
                "1656028",
                45,
                45,
                "1",
                "4",
                null,
                "10813496 - Genadi",
                "http://news-post.ru",
                "9",
                null
        ));


        siteModels.put("1764661", model(
                "1764661",
                45,
                45,
                "0",
                "0",
                null,
                "11206263 - Дмитрий",
                "http://loxik.ru/",
                "6",
                null
        ));
        siteModels.put("1764648", model(
                "1764648",
                45,
                45,
                "0",
                "0",
                null,
                "11206263 - Дмитрий",
                "http://hancho.ru/",
                "6",
                null
        ));

        siteModels.put("1750464", model(
                "1750464",
                45,
                45,
                "0",
                "0",
                null,
                "11016161 - Stepan",
                "http://grvume.ru/",
                "6",
                null
        ));
        siteModels.put("1761182", model(
                "1761182",
                45,
                45,
                "1",
                "4",
                null,
                "11016161 - Stepan",
                "http://qani.ru",
                "8",
                null
        ));
        siteModels.put("1730509", model(
                "1730509",
                45,
                45,
                "1",
                "4",
                null,
                "11016161 - Stepan",
                "http://gexecik.ru",
                "8",
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
        siteModels.put("1751091", model(
                "1751091",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "http://virnag.ru/",
                "6",
                null
        ));

        siteModels.put("1729018", model(
                "1729018",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "http://laflux.ru",
                "6",
                null
        ));

        siteModels.put("1760244", model(
                "1760244",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "https://my-posts.ru",
                "6",
                null
        ));

        siteModels.put("1750962", model(
                "1750962",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "http://nagita.ru/",
                "6",
                null
        ));

        siteModels.put("1712033", model(
                "1712033",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "http://psixushka.ru/",
                "6",
                null
        ));

        siteModels.put("1712034", model(
                "1712034",
                30,
                30,
                "0",
                "0",
                null,
                "9950949 - Artyom",
                "http://psixushka.ru/",
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
        siteModels.put("1758715", model(
                "1758715",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "http://vikix.ru/",
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
                "10603708 - Areg",
                "http://junjo.ru/",
                "5",
                null
        ));
        siteModels.put("1752452", model(
                "1752452",
                40,
                40,
                "1",
                "4",
                null,
                "10603708 - Areg",
                "http://timonik.ru/",
                "5",
                null
        ));
        siteModels.put("1707416", model(
                "1707416",
                40,
                40,
                "1",
                "4",
                null,
                "10603708 - Areg",
                "http://chkaser.ru/",
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
                "10603708 - Areg",
                "https://ooaoo.ru/",
                "6",
                null
        ));
        siteModels.put("1591609", model(
                "1591609",
                55,
                55,
                "1",
                "4",
                null,
                "10603708 - Areg",
                "https://ooaoo.ru/",
                "6",
                null
        ));

        siteModels.put("1667312", model(
                "1667312",
                40,
                40,
                "0",
                "4",
                null,
                "10603708 - Areg",
                "http://erare.ru/",
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
        siteModels.put("1724783", model(
                "1724783",
                45,
                45,
                "1",
                "4",
                null,
                "7017738 - Vedun",
                "http://mindmo.ru/",
                "8",
                null
        ));
        siteModels.put("1631458", model(
                "1631458",
                45,
                45,
                "1",
                "4",
                null,
                "7017738 - Vedun",
                "http://postler.ru/",
                "8",
                null
        ));
        siteModels.put("1744991", model(
                "1744991",
                45,
                45,
                "1",
                "4",
                null,
                "7017738 - Vedun",
                "http://nomey.ru/",
                "8",
                null
        ));
        siteModels.put("1724786", model(
                "1724786",
                45,
                45,
                "1",
                "4",
                null,
                "7017738 - Vedun",
                "http://lenron.ru/",
                "8",
                null
        ));
        siteModels.put("1798782", model(
                "1798782",
                45,
                45,
                "1",
                "3",
                null,
                "11318806 - Marina",
                "http://howmuchprice.info/",
                "3",
                null
        ));
        siteModels.put("1807005", model(
                "1807005",
                45,
                45,
                "1",
                "3",
                null,
                "11318806 - Marina",
                "http://awhhe.am/",
                "3",
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
        siteModels.put("1494653", model(
                "1494653",
                45,
                45,
                "1",
                "3",
                null,
                "6615828 - Ivan",
                "https://vidzo.me/",
                "5",
                null
        ));

        siteModels.put("1770932", model(
                "1770932",
                45,
                45,
                "1",
                "3",
                null,
                "6615828 - Ivan",
                "https://lyudiraznie24.ru/",
                "5",
                null
        ));

        siteModels.put("1689851", model(
                "1689851",
                45,
                45,
                "1",
                "3",
                null,
                "6615828 - Ivan",
                "https://mosvmeste.ru/",
                "5",
                null
        ));

        siteModels.put("1495353", model(
                "1495353",
                45,
                45,
                "1",
                "3",
                null,
                "6615828 - Ivan",
                "https://yerireq.ru/",
                "5",
                null
        ));

        siteModels.put("1694441", model(
                "1694441",
                45,
                45,
                "0",
                "4",
                null,
                "6615828 - Ivan",
                "https://snamiveselo24.ru/",
                "8",
                null
        ));
        siteModels.put("1694438", model(
                "1694438",
                45,
                45,
                "1",
                "3",
                null,
                "6615828 - Ivan",
                "https://snamiveselo24.ru/",
                "5",
                null
        ));
        siteModels.put("1483835", model(
                "1483835",
                45,
                45,
                "1",
                "3",
                null,
                "6615828 - Ivan",
                "http://sunsee.info/",
                "5",
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
        siteModels.put("1754686", model(
                "1754686",
                40,
                40,
                "1",
                "4",
                null,
                "10199054 - Semir",
                "https://nirlen.ru/",
                "8",
                null
        ));
        siteModels.put("1754687", model(
                "1754687",
                40,
                40,
                "0",
                "4",
                null,
                "10199054 - Semir",
                "https://nirlen.ru/",
                "6",
                null
        ));

        siteModels.put("1786596", model(
                "1786596",
                40,
                40,
                "1",
                "4",
                null,
                "10199054 - Semir",
                "http://lexde.ru/",
                "8",
                null
        ));

        siteModels.put("1678296", model(
                "1678296",
                40,
                40,
                "1",
                "4",
                null,
                "7195882 - Дмитрий",
                "http://palata09.ru/",
                "8",
                null
        ));
        siteModels.put("1681664", model(
                "1681664",
                45,
                45,
                "0",
                "4",
                null,
                "7195882 - Дмитрий",
                "http://palata09.ru/",
                "8",
                null
        ));
        siteModels.put("1794908", model(
                "1794908",
                45,
                45,
                "1",
                "4",
                null,
                "11235471 - Olga Bulkina",
                "http://pozitivonst.ru/",
                "5",
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

//        10813496 - Genadi
//        11206263 - Дмитрий
//        11016161 - Stepan
//        9950949 - Artyom
//        10603708 - Areg
//        7017738 - Vedun
//        11318806 - Marina
//        11026159 - Edoooo
//        6615828 - Ivan
//        10199054 - Semir
//        7195882 - Дмитрий
//        11146537 - Денежный мешок