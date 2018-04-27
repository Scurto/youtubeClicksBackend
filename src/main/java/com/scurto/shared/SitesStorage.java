package com.scurto.shared;

import com.scurto.model.SiteModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

public class SitesStorage {

    public static ArrayList<SiteModel> getAllSitesTaskModelArray() {
        return new ArrayList<SiteModel>(getAllSitesModel().values());
    }

    public static SiteModel getSiteModelById(String key) {
        return getAllSitesModel().get(key);
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
                "http://hodizdorov.ru/site-map",
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
        siteModels.put("1711080", model(
                "1711080",
                45,
                45,
                "1",
                "4",
                null,
                "11016161 - Stepan",
                "http://ininik.ru",
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
        siteModels.put("1641863", model(
                "1641863",
                45,
                45,
                "1",
                "4",
                null,
                "9950949 - Artyom",
                "http://sunsang.ru/",
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

        siteModels.put("1612864", model(
                "1612864",
                40,
                40,
                "1",
                "4",
                null,
                "10603708 - Areg",
                "http://erare.ru/",
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
        siteModels.put("1681885", model(
                "1681885",
                40,
                40,
                "1",
                "4",
                null,
                "10603708 - Areg",
                "http://elnelua.ru/",
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
        siteModels.put("1816941", model(
                "1816941",
                45,
                45,
                "1",
                "4",
                null,
                "7017738 - Vedun",
                "http://lindron.ru/",
                "8",
                null
        ));
        siteModels.put("1750122", model(
                "1750122",
                45,
                45,
                "1",
                "4",
                null,
                "7017738 - Vedun",
                "http://vintor.ru",
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
        siteModels.put("1744475", model(
                "1744475",
                40,
                40,
                "1",
                "4",
                null,
                "11026159 - Edoooo",
                "http://paypey.ru",
                "6",
                null
        ));
        siteModels.put("1727027", model(
                "1727027",
                40,
                40,
                "1",
                "4",
                null,
                "11026159 - Edoooo",
                "http://gvenik.ru",
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
                createSecondaryUrls(
                        "https://vidzo.me/сильным-женщинам-нравится-ходить/",
                        "https://vidzo.me/8-знаков-зодиака-которым-нельзя-давать/",
                        "https://vidzo.me/10-мощных-привычек-счастливых-отношен/",
                        "https://vidzo.me/замена-батареек-прекрасная-груст/",
                        "https://vidzo.me/несравненная-марина-цветаева/",
                        "https://vidzo.me/как-ведут-себя-взрослые-которые-вырос/",
                        "https://vidzo.me/4-знака-зодиака-не-боящиеся-проявлять-и/",
                        "https://vidzo.me/забывчивость-признак-высокого-инте/",
                        "https://vidzo.me/7-главных-ошибок-воспитании-детей/",
                        "https://vidzo.me/дипломатия-искусство-примере/",
                        "https://vidzo.me/одна-булавка-поможет-привлечь-удачу/",
                        "https://vidzo.me/открыть-консервную-банку-голыми-рука/",
                        "https://vidzo.me/как-обстоятельства-меняют-людей/",
                        "https://vidzo.me/идеальный-мужчина-знает-все-сокровен/",
                        "https://vidzo.me/простое-правило-1-секунды-сделает-боле/"
                )
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
                createSecondaryUrls(
                        "https://lyudiraznie24.ru/2018/02/03/парашютист-собрал-кубик-рубика-своб/",
                        "https://lyudiraznie24.ru/2018/02/12/крытый-мост-юнис-уильямс/",
                        "https://lyudiraznie24.ru/2018/02/12/парк-gas-works/",
                        "https://lyudiraznie24.ru/2018/02/23/мышка-отказывается-ложиться-спать-ес/",
                        "https://lyudiraznie24.ru/2018/02/25/красивая-музыка-слушать-одно-удоволь/",
                        "https://lyudiraznie24.ru/2018/03/11/глаз-сахары-самый-загадочный-объект-з/",
                        "https://lyudiraznie24.ru/2018/03/17/о-маленьких-но-постоянно-раздражающи/",
                        "https://lyudiraznie24.ru/2018/03/23/мир-с-высоты-птичьего-полета/",
                        "https://lyudiraznie24.ru/2018/04/08/попугай-говорит-котиком/",
                        "https://lyudiraznie24.ru/2018/04/08/смешной-слоненок-полторы-минуты-пози/",
                        "https://lyudiraznie24.ru/2018/04/08/художник-из-японии-рисует-наши-чувств/",
                        "https://lyudiraznie24.ru/2018/04/15/изучаем-кошачий-язык/",
                        "https://lyudiraznie24.ru/2018/04/15/различные-жизненные-ситуации-милых/",
                        "https://lyudiraznie24.ru/2018/04/15/секвойи-бессмертные-исполинские-ги/"
                )
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
                createSecondaryUrls("https://mosvmeste.ru/2018/01/17/7-фраз-которые-никогда-не-произносят-ус/",
                        "https://mosvmeste.ru/2018/02/06/10-лучших-советов-ошо/",
                        "https://mosvmeste.ru/2018/02/16/один-день-из-жизни-профессионального/",
                        "https://mosvmeste.ru/2018/02/16/отпустишь-прошлое-получишь-будущее/",
                        "https://mosvmeste.ru/2018/02/21/9-способов-выразить-свою-любовь-сло/",
                        "https://mosvmeste.ru/2018/02/25/почему-решать-чужие-проблемы-категор/",
                        "https://mosvmeste.ru/2018/02/26/миллион-алых-роз-прекрасном-испол/",
                        "https://mosvmeste.ru/2018/02/26/фильмы-книги-которые-меняют-жизнь/",
                        "https://mosvmeste.ru/2018/03/04/8-вещей-которые-зрелые-мужчины-никогда/",
                        "https://mosvmeste.ru/2018/03/04/вершина-эгоизма-сологамия-брак/",
                        "https://mosvmeste.ru/2018/03/04/жена-и-удача/",
                        "https://mosvmeste.ru/2018/03/14/10-снов-которые-не-стоит-игнорировать/",
                        "https://mosvmeste.ru/2018/03/14/15-лучших-цитат-омара-хайяма/",
                        "https://mosvmeste.ru/2018/03/19/5-типов-мужчин-которых-никогда/",
                        "https://mosvmeste.ru/2018/03/25/знаки-зодиака-которые-идеально-подхо/",
                        "https://mosvmeste.ru/2018/03/26/10-способов-справиться-с-тревогой/",
                        "https://mosvmeste.ru/2018/04/03/лгут-знаки-зодиака-своим-вторым/",
                        "https://mosvmeste.ru/2018/04/11/10-способов-справиться-со-стрессом/",
                        "https://mosvmeste.ru/2018/04/15/10-мощных-привычек-счастливых-отношен/",
                        "https://mosvmeste.ru/2018/04/24/почему-такая-красивая-одна/"
                        )
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
                createSecondaryUrls(
                        "https://yerireq.ru/2-правила-которые-изменят-вашу-личную-ж/",
                        "https://yerireq.ru/судьба-этой-шпионки-второй-мировой-во/",
                        "https://yerireq.ru/правда-или-ложь/",
                        "https://yerireq.ru/8-фото-мгновение-трагедии-кото/",
                        "https://yerireq.ru/вот-что-происходит-с-вашим-организмом/",
                        "https://yerireq.ru/10-повседневных-вещей-которые-мы-все-эт/",
                        "https://yerireq.ru/юная-акробатка-американском-шоу-та/",
                        "https://yerireq.ru/9-хитростей-которыми-ваши-гаджеты/",
                        "https://yerireq.ru/10-продуктов-которые-не-стоит-хранить/",
                        "https://yerireq.ru/сладкий-ребенок-хочется-слушать-вечн/",
                        "https://yerireq.ru/5-самых-омерзительных-работ/",
                        "https://yerireq.ru/чего-вы-боитесь-больше-всего/"
                )
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
                createSecondaryUrls(

                        "https://snamiveselo24.ru/2017/11/24/солнечную-систему-впервые-прилетел/",
                        "https://snamiveselo24.ru/2017/11/26/вывод-который-можно-сделать-по-походк/",
                        "https://snamiveselo24.ru/2017/11/27/китай-открыл-самую-крутую-библиотеку/",
                        "https://snamiveselo24.ru/2017/11/28/жизнь-1-100-лет-120-секунд/",
                        "https://snamiveselo24.ru/2017/12/10/малыш-вышел-сцену-покорить-се/",
                        "https://snamiveselo24.ru/2018/01/27/малоизвестная-молитва-от-антуана-де-с/",
                        "https://snamiveselo24.ru/2018/02/16/20-цитат-совести-запада-альбера-кам/",
                        "https://snamiveselo24.ru/2018/02/21/вам_вcтpeчались-солнечные-люди/",
                        "https://snamiveselo24.ru/2018/02/26/apple-год-извлекла-тонну-золота-списа/",
                        "https://snamiveselo24.ru/2018/03/04/законная-владелица-солнца-испанка/",
                        "https://snamiveselo24.ru/2018/03/04/пронзительные-рассказы-из-шести-слов/",
                        "https://snamiveselo24.ru/2018/03/14/какую-опасность-скрывают-воды-черног/",
                        "https://snamiveselo24.ru/2018/03/14/путь-электромобиля-tesla-к-марсу-можно-про/",
                        "https://snamiveselo24.ru/2018/03/19/самая-маленькая-дикая-кошка-мире/",
                        "https://snamiveselo24.ru/2018/03/25/гениальный-мультфильм-том-работ/",
                        "https://snamiveselo24.ru/2018/03/26/что-случится-землей-если-солнце-вдру/",
                        "https://snamiveselo24.ru/2018/04/03/детеныш-носорога-преследует-автомоб/",
                        "https://snamiveselo24.ru/2018/04/11/еакция-белухи-двух-малышей-наобор/",
                        "https://snamiveselo24.ru/2018/04/15/позитив-маленьких-африканских-тан/",
                        "https://snamiveselo24.ru/2018/04/24/я-научилась-просто-мудро-жить/"
                )
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

        siteModels.put("1533654", model(
                "1533654",
                40,
                40,
                "1",
                "4",
                null,
                "10199054 - Semir",
                "http://neoguru.ru/",
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

        siteModels.put("1821896", model(
                "1821896",
                45,
                45,
                "1",
                "4",
                null,
                "11235471 - Olga Bulkina",
                "http://helthy.ru/",
                "5",
                null
        ));

        siteModels.put("1822785", model(
                "1822785",
                45,
                45,
                "1",
                "4",
                null,
                "11235471 - Olga Bulkina",
                "http://bulto.ru/",
                "5",
                null
        ));

        siteModels.put("1478391", model(
                "1478391",
                55,
                55,
                "1",
                "5",
                null,
                "9553676 - Дмитрий",
                "http://hodizdorov.ru/site-map",
                "6",
                null
        ));

        siteModels.put("1417724", model(
                "1417724",
                55,
                55,
                "1",
                "5",
                null,
                "9553676 - Дмитрий",
                "http://hodizdorov.ru/site-map",
                "6",
                null
        ));

        siteModels.put("1482297", model(
                "1482297",
                55,
                55,
                "1",
                "5",
                null,
                "9553676 - Дмитрий",
                "http://fit-fox.ru",
                "6",
                null
        ));

        siteModels.put("1479122", model(
                "1479122",
                55,
                55,
                "1",
                "5",
                null,
                "9553676 - Дмитрий",
                "http://ablamirat.ru/",
                "6",
                null
        ));

        siteModels.put("1479172", model(
                "1479172",
                55,
                55,
                "1",
                "5",
                null,
                "9553676 - Дмитрий",
                "http://tempremonta.ru/karta-sajta",
                "6",
                null
        ));
//        http://vector-remonta.ru/karta-sajta
//        http://vash-center.ru/karta
//        http://nauka-mastera.ru/karta
//        http://ya-vdome.ru/karta-sajta
//        http://ideya-doma.ru/karta
//        http://tempremonta.ru/karta-sajta
//        http://freshremont.com/sitemap
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