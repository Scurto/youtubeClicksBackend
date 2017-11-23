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

        reklamaModels.put("liquimoly.ua", model(
                "https://liquimoly.ua/shop/?gclid=",
                "liquimoly.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Motornye_masla",""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Prisadki",""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Avtokosmetika",""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Transmissionnye_masla",""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Smazki",""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Tehnologicheskie_zhidkosti","")
                )
        ));

        reklamaModels.put("mgorodok.com.ua", model(
                "https://mgorodok.com.ua/?gclid=",
                "mgorodok.com.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://mgorodok.com.ua/genplan.html",""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/kvartiry/5-ochered.html",""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/kotedzhi/",""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/gallery/",""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/tekh-usloviya.html",""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/kontakty.html","")
                )
        ));

        reklamaModels.put("bubnovsky.com.ua", model(
                "http://www.bubnovsky.com.ua/?gclid=",
                "bubnovsky.com.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/contacts/",""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/methods/",""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/treat/",""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/trainers/",""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/vakansii/",""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/questions/","")
                )
        ));

        reklamaModels.put("stekloarmatura.com.ua", model(
                "http://stekloarmatura.com.ua/?adwords_remarketing&gclid=",
                "stekloarmatura.com.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/o-nas",""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/produktsiya",""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/kharakteristiki",""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/preimushchestva",""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/stekloplastikovaya-armatura-tsena",""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/galereya","")
                )
        ));

        reklamaModels.put("answear.ua", model(
                "https://answear.ua/komplekty/komplekty.html/?gclid=",
                "answear.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://answear.ua/p/ona-4-k.html",""),
                        new SecondaryReklamaModel("https://answear.ua/p/on-89-k.html",""),
                        new SecondaryReklamaModel("https://answear.ua/p/obuv-204-k.html",""),
                        new SecondaryReklamaModel("https://answear.ua/p/aksessuary-205-k.html",""),
                        new SecondaryReklamaModel("https://answear.ua/brands-zhenskiye.html",""),
                        new SecondaryReklamaModel("https://answear.ua/p/bk-6582-k.html","")
                )
        ));

        reklamaModels.put("kobzov.ua", model(
                "http://kobzov.ua/shows/cirk-recordiv/?gclid=",
                "kobzov.ua",
                Location.UA.getKey(),
                Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://kobzov.ua/blog/",""),
                        new SecondaryReklamaModel("http://kobzov.ua/faq/",""),
                        new SecondaryReklamaModel("http://kobzov.ua/pro-tsyrk/",""),
                        new SecondaryReklamaModel("http://kobzov.ua/contacts/",""),
                        new SecondaryReklamaModel("http://kobzov.ua/kvytky/",""),
                        new SecondaryReklamaModel("http://kobzov.ua/shows/cirk-recordiv/kyiv/#tickets","")
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
