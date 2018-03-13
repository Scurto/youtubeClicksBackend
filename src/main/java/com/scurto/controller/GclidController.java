package com.scurto.controller;

import com.scurto.model.AutoCloseAdvertiseModel;
import com.scurto.model.TampermonkeyModel;
import com.scurto.service.GclidService;
import com.scurto.model.GclidStorageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

/**
 * Created by yustymenko on 13.12.2017.
 */
@RestController
@RequestMapping(value = "/gclid")
@CrossOrigin
public class GclidController {

    @Autowired
    private GclidService service;

    ArrayList<GclidStorageModel> gclidStorage;

    private String autoCloseAdvertiseFlag = "yes";

    @RequestMapping(value = "/getTampermonkeyGClid", method = RequestMethod.POST)
    @ResponseBody
    public String getTampermonkeyGclid(@RequestBody TampermonkeyModel model) {

        System.out.println("MODEL -> " + model);
        if (model.getUrl() != null && model.getUrl().toLowerCase().contains("gclid=")) {
            String formatted = model.getUrl().substring(model.getUrl().indexOf("gclid=") + 6, model.getUrl().length());
            //            service.addKey(formatted);

            if (gclidStorage == null) {
                gclidStorage = new ArrayList<>();
            }
            gclidStorage.add(new GclidStorageModel(formatted, LocalDateTime.now()));
        }


        return "response";
    }

    @RequestMapping(value = "/getGClid", method = RequestMethod.GET)
    public String getGClid() {
        try {
            Random rnd = new Random();
            StringBuilder defUrl= new StringBuilder("?utm_term=" + rnd.nextInt(999999999));

            ArrayList<String> gclidUriAttributes = new ArrayList<>();
            gclidUriAttributes.add("&utm_medium=gdn");
            gclidUriAttributes.add("&utm_source=awo");
            gclidUriAttributes.add("&utm_content=google");
            gclidUriAttributes.add("&utm_campaign=" + rnd.nextInt(999999999));
            gclidUriAttributes.add("&utm_medium=display");
            gclidUriAttributes.add("&promo=" + rnd.nextInt(999999999));

            for (String uriAttribute : gclidUriAttributes) {
                if (Math.round(Math.random()) > 0) {
                    defUrl.append(uriAttribute);
                }
            }

            defUrl.append("&gclid=");

            LocalDateTime etalonTime = LocalDateTime.now();
            System.out.println("etalon time -> " + etalonTime);

            System.out.println("+++++++++++++++++++++");
            for (GclidStorageModel gclidStorageModel : gclidStorage) {
                System.out.println(gclidStorageModel);
            }

            System.out.println("+++++++++++++++++++++");

            Optional<GclidStorageModel> any = gclidStorage.stream()
                    .filter(model -> etalonTime.minusSeconds(20).isBefore(model.getTime()) && etalonTime.plusSeconds(20).isAfter(model.getTime()))
                    .findAny();

            if (any.isPresent()) {
                System.out.println(any.get().toString());
            } else {
                System.out.println("Index OUT of Bound");
            }

            defUrl.append(any.get().getGclid());

            return defUrl.toString();
        } catch (Exception ex) {
            return null;
        }
    }

    @RequestMapping(value = "/clearGcidTable", method = RequestMethod.POST)
    @ResponseBody
    public String clearGcidTable() {
        service.clearTable();
        return "";
    }

    @RequestMapping(value = "/checkServer", method = RequestMethod.POST)
    @ResponseBody
    public String checkServer() {
        System.out.println("checkServer");
        return "work";
    }

    @RequestMapping(value = "/isAutoCloseAdvertise", method = RequestMethod.POST)
    @ResponseBody
    public String isAutoCloseAdvertise() {
        return getAutoCloseAdvertiseFlag();
    }

    @RequestMapping(value = "/setAutoCloseAdvertise", method = RequestMethod.POST)
    @ResponseBody
    public String setAutoCloseAdvertise(@RequestBody AutoCloseAdvertiseModel flag) {
        setAutoCloseAdvertiseFlag(flag.getFlag());
        return "";
    }

    public String getAutoCloseAdvertiseFlag() {
        return autoCloseAdvertiseFlag;
    }

    public void setAutoCloseAdvertiseFlag(String autoCloseAdvertiseFlag) {
        this.autoCloseAdvertiseFlag = autoCloseAdvertiseFlag;
    }

    //    @RequestMapping(value = "/getAllGclids", method = RequestMethod.POST)
//    @ResponseBody
//    public ArrayList<Gclid> getAllGclids() {
//        ArrayList<String> gclidTickTimes = new ArrayList<>();
//        String myTime1 = "13:06:02";
//        String myTime2 = "13:07:34";
//        gclidTickTimes.add(myTime1);
//        gclidTickTimes.add(myTime2);
//
//        LocalDateTime currentTime = LocalDate.now().atTime(13, 02, 22);
//        System.out.println(currentTime);
//
//
//        List<Gclid> allGClids = service.getAllGClids();
//        ArrayList<Gclid> fullAllGclid = new ArrayList<>();
//        for (Gclid gClid : allGClids) {
//            gClid.setLocalDateTime(getLocalDateTime(gClid.getTime()));
//            fullAllGclid.add(gClid);
//        }
//
////        for (String tickTime : gclidTickTimes) {
////            LocalDateTime localTickTime = getLocalDateTime(tickTime);
////            for (Gclid gclid : fullAllGclid) {
////                LocalDateTime plus40Seconds = localTickTime.plusSeconds(40);
////                LocalDateTime minus40Seconds = localTickTime.minusSeconds(40);
////                if (plus40Seconds.isAfter(gclid.getLocalDateTime()) && minus40Seconds.isBefore(gclid.getLocalDateTime())) {
////                    System.out.println(gclid + " -> " + "apply for " + tickTime);
////                }
////            }
////        }
//
//
//        try {
//            return fullAllGclid;
//        } catch (Exception ex) {
//            return null;
//        }
//
//    }

//    private LocalDateTime getLocalDateTime(String tickTime) {
//        String[] split = tickTime.split(":");
//        return LocalDate.now().atTime(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
//    }

}
