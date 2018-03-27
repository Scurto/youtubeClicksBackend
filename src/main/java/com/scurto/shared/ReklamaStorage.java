package com.scurto.shared;

import com.scurto.model.ReklamaModel;
import com.scurto.model.advertise.SecondaryReklamaModel;

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
                "http://novbud.com.ua/",
                "novbud.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://novbud.com.ua/o-komplekse/infrastruktura-2/", ""),
                        new SecondaryReklamaModel("http://novbud.com.ua/o-komplekse/dokumentatsiya/", ""),
                        new SecondaryReklamaModel("http://novbud.com.ua/vyibrat-kvartiru/kommercheskaya-nedvizh-t/", ""),
                        new SecondaryReklamaModel("http://novbud.com.ua/vyibrat-kvartiru/prodazha-parkovok/", ""),
                        new SecondaryReklamaModel("http://novbud.com.ua/o-komplekse/o-zastroyshhike/", "")
                )
        ));


        reklamaModels.put("superhotel.kiev.ua", model(
                "http://superhotel.kiev.ua/",
                "superhotel.kiev.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/rules/", ""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/kvartiry/", ""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/oteli/", ""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/coord/", ""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/reserve/", ""),
                        new SecondaryReklamaModel("http://superhotel.kiev.ua/ur/", "")
                )
        ));

        reklamaModels.put("liquimoly.ua", model(
                "https://liquimoly.ua/shop/",
                "liquimoly.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Motornye_masla", ""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Prisadki", ""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Avtokosmetika", ""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Transmissionnye_masla", ""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Smazki", ""),
                        new SecondaryReklamaModel("https://liquimoly.ua/shop/Tehnologicheskie_zhidkosti", "")
                )
        ));

        reklamaModels.put("mgorodok.com.ua", model(
                "https://mgorodok.com.ua/",
                "mgorodok.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://mgorodok.com.ua/genplan.html", ""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/kvartiry/5-ochered.html", ""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/kotedzhi/", ""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/gallery/", ""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/tekh-usloviya.html", ""),
                        new SecondaryReklamaModel("https://mgorodok.com.ua/kontakty.html", "")
                )
        ));

        reklamaModels.put("bubnovsky.com.ua", model(
                "http://www.bubnovsky.com.ua/",
                "bubnovsky.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/contacts/", ""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/methods/", ""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/treat/", ""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/trainers/", ""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/vakansii/", ""),
                        new SecondaryReklamaModel("http://www.bubnovsky.com.ua/questions/", "")
                )
        ));

        reklamaModels.put("stekloarmatura.com.ua", model(
                "http://stekloarmatura.com.ua/",
                "stekloarmatura.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/o-nas", ""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/produktsiya", ""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/kharakteristiki", ""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/preimushchestva", ""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/stekloplastikovaya-armatura-tsena", ""),
                        new SecondaryReklamaModel("http://stekloarmatura.com.ua/galereya", "")
                )
        ));

        reklamaModels.put("answear.ua", model(
                "https://answear.ua/komplekty/komplekty.html/",
                "answear.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://answear.ua/p/ona-4-k.html", ""),
                        new SecondaryReklamaModel("https://answear.ua/p/on-89-k.html", ""),
                        new SecondaryReklamaModel("https://answear.ua/p/obuv-204-k.html", ""),
                        new SecondaryReklamaModel("https://answear.ua/p/aksessuary-205-k.html", ""),
                        new SecondaryReklamaModel("https://answear.ua/brands-zhenskiye.html", ""),
                        new SecondaryReklamaModel("https://answear.ua/p/bk-6582-k.html", "")
                )
        ));

        reklamaModels.put("ub-commercial.com.ua", model(
                "https://ub-commercial.com.ua/promotions",
                "ub-commercial.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://ub-commercial.com.ua/about", ""),
                        new SecondaryReklamaModel("https://ub-commercial.com.ua/objects", ""),
                        new SecondaryReklamaModel("https://ub-commercial.com.ua/premises", ""),
                        new SecondaryReklamaModel("https://ub-commercial.com.ua/rent", ""),
                        new SecondaryReklamaModel("https://ub-commercial.com.ua/news", "")
                )
        ));

        reklamaModels.put("atlant.build", model(
                "https://atlant.build/novosti",
                "atlant.build",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://atlant.build/o-kompanii/opisanie", ""),
                        new SecondaryReklamaModel("https://atlant.build/o-kompanii/nagradyi", ""),
                        new SecondaryReklamaModel("https://atlant.build/o-kompanii/otzyvy", ""),
                        new SecondaryReklamaModel("https://atlant.build/kommertsiya", ""),
                        new SecondaryReklamaModel("https://atlant.build/o-kompanii/istoriya", "")
                )
        ));

        reklamaModels.put("grusha.ua", model(
                "https://grusha.ua/catalog/zernovoy_kofe/",
                "grusha.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://grusha.ua/catalog/molotyy_kofe/", ""),
                        new SecondaryReklamaModel("https://grusha.ua/catalog/monosorta/", ""),
                        new SecondaryReklamaModel("https://grusha.ua/catalog/rastvorimyy_kofe/", ""),
                        new SecondaryReklamaModel("https://grusha.ua/info/payment/", ""),
                        new SecondaryReklamaModel("https://grusha.ua/info/delivery/", ""),
                        new SecondaryReklamaModel("https://grusha.ua/contacts/stores/", "")
                )
        ));

        reklamaModels.put("exist.ua", model(
                "https://exist.ua/action-sale/",
                "exist.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://exist.ua/about/address.aspx", ""),
                        new SecondaryReklamaModel("https://exist.ua/cat/TecDoc", ""),
                        new SecondaryReklamaModel("https://exist.ua/Catalog/Goods/7", ""),
                        new SecondaryReklamaModel("https://exist.ua/about/supplier.aspx", ""),
                        new SecondaryReklamaModel("https://exist.ua/about/partners.aspx", ""),
                        new SecondaryReklamaModel("https://exist.ua/about/opt/discount.aspx", "")
                )
        ));

        reklamaModels.put("x-moda.ru", model(
                "https://x-moda.ru/catalog",
                "x-moda.ru",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://x-moda.ru/catalog/zhenschinam", ""),
                        new SecondaryReklamaModel("https://x-moda.ru/catalog/muzhchinam", ""),
                        new SecondaryReklamaModel("https://x-moda.ru/catalog/detyam", ""),
                        new SecondaryReklamaModel("https://x-moda.ru/catalog/brendy", ""),
                        new SecondaryReklamaModel("https://x-moda.ru/catalog/novinki", ""),
                        new SecondaryReklamaModel("https://x-moda.ru/obrazy_ot_stilistov", "")
                )
        ));

        reklamaModels.put("alser.ua", model(
                "https://alser.ua/aktsii/",
                "alser.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://alser.ua/dokumenty/", ""),
                        new SecondaryReklamaModel("https://alser.ua/kontakty/", ""),
                        new SecondaryReklamaModel("https://alser.ua/vakansii/", ""),
                        new SecondaryReklamaModel("https://alser.ua/otzyvy/", ""),
                        new SecondaryReklamaModel("https://alser.ua/zhalyuzi/", ""),
                        new SecondaryReklamaModel("https://alser.ua/shtory/", "")
                )
        ));

        reklamaModels.put("fantastika-nn.ru", model(
                "http://www.fantastika-nn.ru/news/event/",
                "fantastika-nn.ru",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.fantastika-nn.ru/arendatory/magaziny/", ""),
                        new SecondaryReklamaModel("http://www.fantastika-nn.ru/arendatory/kafe-i-restorany/", ""),
                        new SecondaryReklamaModel("http://www.fantastika-nn.ru/arendatory/kinoteatr/", ""),
                        new SecondaryReklamaModel("http://www.fantastika-nn.ru/arendatory/razvlecheniya/", ""),
                        new SecondaryReklamaModel("http://www.fantastika-nn.ru/arendatory/uslugi/", ""),
                        new SecondaryReklamaModel("http://www.fantastika-nn.ru/o-trts/", "")
                )
        ));

        reklamaModels.put("rinza.ru", model(
                "https://www.rinza.ru/",
                "rinza.ru",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://www.rinza.ru/producty", ""),
                        new SecondaryReklamaModel("https://www.rinza.ru/instrukciya", ""),
                        new SecondaryReklamaModel("https://www.rinza.ru/symptomi", ""),
                        new SecondaryReklamaModel("https://www.rinza.ru/lechenie-grippa-prostudi", ""),
                        new SecondaryReklamaModel("https://www.rinza.ru/statji", ""),
                        new SecondaryReklamaModel("https://www.rinza.ru/instrukciya/rinzasip-poroshki", "")
                )
        ));

        reklamaModels.put("hager.ua", model(
                "http://www.hager.ua/produkciya/22123.htm",
                "hager.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.hager.ua/korisna-informaciya/novini/25967.htm", ""),
                        new SecondaryReklamaModel("http://www.hager.ua/pro-kompaniyu/24123.htm", ""),
                        new SecondaryReklamaModel("http://www.hager.ua/realizovani-proekti/21783.htm", ""),
                        new SecondaryReklamaModel("http://www.hager.ua/kontakti/21744.htm", ""),
                        new SecondaryReklamaModel("http://www.hager.ua/zavantazhennya/21903.htm", ""),
                        new SecondaryReklamaModel("http://www.hager.ua/korisna-informaciya/21764.htm", "")
                )
        ));

        reklamaModels.put("itea.ua", model(
                "https://itea.ua/about-itea/",
                "itea.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://itea.ua/courses-itea/", ""),
                        new SecondaryReklamaModel("https://itea.ua/corporate-education-schedule/", ""),
                        new SecondaryReklamaModel("https://itea.ua/news/", ""),
                        new SecondaryReklamaModel("https://itea.ua/premises-lease/", ""),
                        new SecondaryReklamaModel("https://itea.ua/contacts/", ""),
                        new SecondaryReklamaModel("https://itea.ua/consulting/", "")
                )
        ));

        reklamaModels.put("hon.ru", model(
                "http://www.hon.ru/",
                "hon.ru",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.hon.ru/ru/st_petersburg_hotels/", ""),
                        new SecondaryReklamaModel("http://www.hon.ru/ru/services/", ""),
                        new SecondaryReklamaModel("http://www.hon.ru/ru/specials/", ""),
                        new SecondaryReklamaModel("http://www.hon.ru/ru/payment/", ""),
                        new SecondaryReklamaModel("http://www.hon.ru/ru/opinions/", ""),
                        new SecondaryReklamaModel("http://www.hon.ru/ru/contact/", "")
                )
        ));

        reklamaModels.put("cgtarian.ru", model(
                "http://www.cgtarian.ru/online-kursy/razrabotka-igr/game-design-ot-a-do-ya.html",
                "cgtarian.ru",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.cgtarian.ru/cg-3d-grafika-animaciya-vfx/anonsy-novosti.html", ""),
                        new SecondaryReklamaModel("http://www.cgtarian.ru/cg-3d-grafika-animaciya-vfx/konkursy.html", ""),
                        new SecondaryReklamaModel("http://www.cgtarian.ru/online-shkola/programma-skidok.html", ""),
                        new SecondaryReklamaModel("http://www.cgtarian.ru/online-shkola/instruktory.html", ""),
                        new SecondaryReklamaModel("http://www.cgtarian.ru/online-shkola/kontakty.html", ""),
                        new SecondaryReklamaModel("http://www.cgtarian.ru/otzyvy-studentov.html", "")
                )
        ));

        reklamaModels.put("lebedinyiy.com.ua", model(
                "https://lebedinyiy.com.ua/ru/technical-specifications/",
                "lebedinyiy.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://lebedinyiy.com.ua/ru/option/", ""),
                        new SecondaryReklamaModel("https://lebedinyiy.com.ua/ru/benefits/", ""),
                        new SecondaryReklamaModel("https://lebedinyiy.com.ua/ru/galery/", ""),
                        new SecondaryReklamaModel("https://lebedinyiy.com.ua/ru/news/", ""),
                        new SecondaryReklamaModel("https://lebedinyiy.com.ua/ru/contacts/", ""),
                        new SecondaryReklamaModel("https://lebedinyiy.com.ua/ru/rooms/", "")
                )
        ));

        reklamaModels.put("diamond-gallery.com.ua", model(
                "https://diamond-gallery.com.ua/content/761-programma-loyalnosti-i-deystvuushie-akcii",
                "diamond-gallery.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://diamond-gallery.com.ua/390-diamond-expert", ""),
                        new SecondaryReklamaModel("https://diamond-gallery.com.ua/93-ukrashenija", ""),
                        new SecondaryReklamaModel("https://diamond-gallery.com.ua/389-koltsa-dlya-pomolvki", ""),
                        new SecondaryReklamaModel("https://diamond-gallery.com.ua/40-obruchalnye-koltsa", ""),
                        new SecondaryReklamaModel("https://diamond-gallery.com.ua/content/743-spravochnik", ""),
                        new SecondaryReklamaModel("https://diamond-gallery.com.ua/2-koltsa", "")
                )
        ));

        reklamaModels.put("ub.com.ua", model(
                "https://ub.com.ua/promotions",
                "ub.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://ub.com.ua/corporation", ""),
                        new SecondaryReklamaModel("https://ub.com.ua/projects", ""),
                        new SecondaryReklamaModel("https://ub.com.ua/news", ""),
                        new SecondaryReklamaModel("https://ub.com.ua/terms_of_purchase", ""),
                        new SecondaryReklamaModel("https://ub.com.ua/responsibility", ""),
                        new SecondaryReklamaModel("https://ub.com.ua/contacts", "")
                )
        ));

        reklamaModels.put("game-shop.com.ua", model(
                "https://game-shop.com.ua/page/news",
                "game-shop.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://game-shop.com.ua/page/o_nas", ""),
                        new SecondaryReklamaModel("https://game-shop.com.ua/page/garantija", ""),
                        new SecondaryReklamaModel("https://game-shop.com.ua/page/oplata-i-dostavka", ""),
                        new SecondaryReklamaModel("https://game-shop.com.ua/page/kontakti", ""),
                        new SecondaryReklamaModel("https://game-shop.com.ua/category/igrovue-pristavki", ""),
                        new SecondaryReklamaModel("https://game-shop.com.ua/category/aksessuaru-k-pristavkam", "")
                )
        ));

        reklamaModels.put("sohorooms.ua", model(
                "https://sohorooms.ua/sale",
                "sohorooms.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://sohorooms.ua/novinki", ""),
                        new SecondaryReklamaModel("https://sohorooms.ua/brands", ""),
                        new SecondaryReklamaModel("https://sohorooms.ua/jenskoe", ""),
                        new SecondaryReklamaModel("https://sohorooms.ua/muzhchinam", ""),
                        new SecondaryReklamaModel("https://sohorooms.ua/gifts", ""),
                        new SecondaryReklamaModel("https://sohorooms.ua/muzhchinam/akseccuary", "")
                )
        ));

        reklamaModels.put("sevgorod.ru", model(
                "http://www.sevgorod.ru/actions/",
                "sevgorod.ru",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.sevgorod.ru/objects/live/", ""),
                        new SecondaryReklamaModel("http://www.sevgorod.ru/forbuyer/sposob/", ""),
                        new SecondaryReklamaModel("http://www.sevgorod.ru/about/", ""),
                        new SecondaryReklamaModel("http://www.sevgorod.ru/contacts/", ""),
                        new SecondaryReklamaModel("http://www.sevgorod.ru/about/important/", "")
                )
        ));

        reklamaModels.put("lioncom.pro", model(
                "https://lioncom.pro/projects/",
                "lioncom.pro",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://lioncom.pro/services/", ""),
                        new SecondaryReklamaModel("https://lioncom.pro/clients/", ""),
                        new SecondaryReklamaModel("https://lioncom.pro/agency/historic-page/", ""),
                        new SecondaryReklamaModel("https://lioncom.pro/contacts/", ""),
                        new SecondaryReklamaModel("https://lioncom.pro/organizatsiya-prazdnichnogo-otkrytiya/", "")
                )
        ));

        reklamaModels.put("northcyprusinvest.net", model(
                "http://northcyprusinvest.net/properties/investments/",
                "northcyprusinvest.net",
                ReklamaModel.Location.RU.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://northcyprusinvest.net/properties/apartments/", ""),
                        new SecondaryReklamaModel("http://northcyprusinvest.net/properties/villas/", ""),
                        new SecondaryReklamaModel("http://northcyprusinvest.net/info/", ""),
                        new SecondaryReklamaModel("http://northcyprusinvest.net/properties/commercial/", ""),
                        new SecondaryReklamaModel("http://northcyprusinvest.net/pages/private/", ""),
                        new SecondaryReklamaModel("http://northcyprusinvest.net/rent/", "")
                )
        ));

        reklamaModels.put("iconiqlab.com", model(
                "https://iconiqlab.com/",
                "iconiqlab.com",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://iconiqlab.com/startups/", ""),
                        new SecondaryReklamaModel("https://iconiqlab.com/community/", ""),
                        new SecondaryReklamaModel("https://iconiqlab.com/about-us/", ""),
                        new SecondaryReklamaModel("https://iconiqlab.com/events/", ""),
                        new SecondaryReklamaModel("https://iconiqlab.com/faq/", ""),
                        new SecondaryReklamaModel("https://iconiqlab.com/contact/", "")
                )
        ));

        reklamaModels.put("lapti.life", model(
                "https://lapti.life/catalog/sale",
                "lapti.life",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://lapti.life/catalog/promo", ""),
                        new SecondaryReklamaModel("https://lapti.life/catalog/filter/for-women", ""),
                        new SecondaryReklamaModel("https://lapti.life/catalog/filter/for-man", ""),
                        new SecondaryReklamaModel("https://lapti.life/catalog/filter/for-kids", ""),
                        new SecondaryReklamaModel("https://lapti.life/catalog/accessories/c3", ""),
                        new SecondaryReklamaModel("https://lapti.life/catalog/outlet", "")
                )
        ));

        reklamaModels.put("zov-kyxnu.com.ua", model(
                "http://www.zov-kyxnu.com.ua/aktsii",
                "zov-kyxnu.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://www.zov-kyxnu.com.ua/katalog", ""),
                        new SecondaryReklamaModel("http://www.zov-kyxnu.com.ua/otzyvy/reviews", ""),
                        new SecondaryReklamaModel("http://www.zov-kyxnu.com.ua/uslugi/besplatnyj-vyzov-zamershchika", ""),
                        new SecondaryReklamaModel("http://www.zov-kyxnu.com.ua/korpusnaya-mebel-zov", ""),
                        new SecondaryReklamaModel("http://www.zov-kyxnu.com.ua/kukhni-tv", ""),
                        new SecondaryReklamaModel("http://www.zov-kyxnu.com.ua/o-kompanii", "")
                )
        ));

        reklamaModels.put("vpohod.in.ua", model(
                "http://vpohod.in.ua/aktsii",
                "vpohod.in.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://vpohod.in.ua/news", ""),
                        new SecondaryReklamaModel("http://vpohod.in.ua/catalog", ""),
                        new SecondaryReklamaModel("http://vpohod.in.ua/info", ""),
                        new SecondaryReklamaModel("http://vpohod.in.ua/catalog/lodochnie-motori-benzinovie/maslo-dlya-lodochnih-motorov", ""),
                        new SecondaryReklamaModel("http://vpohod.in.ua/catalog/naduvnie-lodki/grebnie-naduvnie-lodki", ""),
                        new SecondaryReklamaModel("http://vpohod.in.ua/catalog/palatki/dvuhmestnie-palatki", "")
                )
        ));

        reklamaModels.put("humanhair.com.ua", model(
                "http://humanhair.com.ua/novosti-i-akcii.html",
                "humanhair.com.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("http://humanhair.com.ua/about.html", ""),
                        new SecondaryReklamaModel("http://humanhair.com.ua/uslugi.html", ""),
                        new SecondaryReklamaModel("http://humanhair.com.ua/dostavka-i-oplata.html", ""),
                        new SecondaryReklamaModel("http://humanhair.com.ua/stati.html", ""),
                        new SecondaryReklamaModel("http://humanhair.com.ua/partneram.html", ""),
                        new SecondaryReklamaModel("http://humanhair.com.ua/contacts.html", "")
                )
        ));

        reklamaModels.put("uniqa.ua", model(
                "https://uniqa.ua/private/auto/kasko/",
                "uniqa.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://uniqa.ua/private/home/", ""),
                        new SecondaryReklamaModel("https://uniqa.ua/private/travel/", ""),
                        new SecondaryReklamaModel("https://uniqa.ua/private/life/", ""),
                        new SecondaryReklamaModel("https://uniqa.ua/case/", ""),
                        new SecondaryReklamaModel("https://uniqa.ua/about_us/", ""),
                        new SecondaryReklamaModel("https://uniqa.ua/contacts/contact/", "")
                )
        ));

        reklamaModels.put("sniker.ua", model(
                "https://sniker.ua/best_sale/",
                "sniker.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://sniker.ua/new/", ""),
                        new SecondaryReklamaModel("https://sniker.ua/mujchinam/", ""),
                        new SecondaryReklamaModel("https://sniker.ua/jenschinam/", ""),
                        new SecondaryReklamaModel("https://sniker.ua/action/", ""),
                        new SecondaryReklamaModel("https://sniker.ua/info/", ""),
                        new SecondaryReklamaModel("https://sniker.ua/about/", "")
                )
        ));

        reklamaModels.put("oiler.ua", model(
                "https://oiler.ua/sto/",
                "oiler.ua",
                ReklamaModel.Location.UA.getKey(),
                ReklamaModel.Type.REKLAMA.getKey(),
                createSecondaryReklama(
                        new SecondaryReklamaModel("https://oiler.ua/masla/", ""),
                        new SecondaryReklamaModel("https://oiler.ua/zapchasti/to-filters/", ""),
                        new SecondaryReklamaModel("https://oiler.ua/o-nas/", ""),
                        new SecondaryReklamaModel("https://oiler.ua/kontakty/", ""),
                        new SecondaryReklamaModel("https://oiler.ua/dostavka-i-oplata/", ""),
                        new SecondaryReklamaModel("https://oiler.ua/zapchasti/", "")
                )
        ));


//        reklamaModels.put("kobzov.ua", model(
//                "http://kobzov.ua/shows/cirk-recordiv/",
//                "kobzov.ua",
//        ReklamaModel.Location.UA.getKey(),
//                ReklamaModel.Type.REKLAMA.getKey(),
//                createSecondaryReklama(
//                        new SecondaryReklamaModel("",""),
//                        new SecondaryReklamaModel("",""),
//                        new SecondaryReklamaModel("",""),
//                        new SecondaryReklamaModel("",""),
//                        new SecondaryReklamaModel("",""),
//                        new SecondaryReklamaModel("","")
//                )
//        ));


        return reklamaModels;
    }

    private static ArrayList<SecondaryReklamaModel> createSecondaryReklama(SecondaryReklamaModel... elements) {
        ArrayList<SecondaryReklamaModel> list = new ArrayList<>();
        list.addAll(Arrays.asList(elements));
        return list;
    }

    private static ReklamaModel model(String mainUrl, String id, String location, String type, ArrayList<SecondaryReklamaModel> list) {

        return new ReklamaModel(mainUrl, id, location, type, "www." + id, list);
    }
}
