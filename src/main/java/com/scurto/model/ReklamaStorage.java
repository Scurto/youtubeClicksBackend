package com.scurto.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by yustymenko on 13.10.2017.
 */
public class ReklamaStorage {

    public static HashMap<String, ReklamaModel> getAllReklama() {
        HashMap<String, ReklamaModel> reklamaModels = new HashMap<>();

        reklamaModels.put("novbud.com.ua", model(
                "http://novbud.com.ua/?adwords_remarketing&gclid=",
                "novbud.com.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://novbud.com.ua/o-komplekse/infrastruktura-2/",""),
                        new SecondaryReklamaModel("http://novbud.com.ua/o-komplekse/dokumentatsiya/",""),
                        new SecondaryReklamaModel("http://novbud.com.ua/vyibrat-kvartiru/kommercheskaya-nedvizh-t/",""),
                        new SecondaryReklamaModel("http://novbud.com.ua/vyibrat-kvartiru/prodazha-parkovok/",""),
                        new SecondaryReklamaModel("http://novbud.com.ua/o-komplekse/o-zastroyshhike/","")
                )
        ));


        reklamaModels.put("superhotel.kiev.ua", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("test1", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("test2", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("test3", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("test4", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("test5", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("rek3", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        reklamaModels.put("rek18", model(
                "http://superhotel.kiev.ua/?gclid=",
                "superhotel.kiev.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/",""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/","")
                )
        ));

        return reklamaModels;
    }

    private static ArrayList<SecondaryReklamaModel> createSecondaryReklama(SecondaryReklamaModel ... elements) {
        ArrayList<SecondaryReklamaModel> list = new ArrayList<>();
        list.addAll(Arrays.asList(elements));
        return list;
    }

    private static ReklamaModel model(String mainUrl, String id, String location, String type, ArrayList<SecondaryReklamaModel> list) {

        return new ReklamaModel(mainUrl, id, location, type, "www."+id, list);
    }
}
