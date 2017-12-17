package com.scurto.controller;

import com.scurto.model.Gclid;
import com.scurto.model.TampermonkeyModel;
import com.scurto.service.GclidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yustymenko on 13.12.2017.
 */
@RestController
@RequestMapping(value = "/gclid")
@CrossOrigin
public class GclidController {

    @Autowired
    private GclidService service;

    @RequestMapping(value = "/getTampermonkeyGClid", method = RequestMethod.POST)
    @ResponseBody
    public String getTampermonkeyGclid(@RequestBody TampermonkeyModel model) {

        if (model.getUrl() != null && model.getUrl().toLowerCase().contains("gclid=")) {
            System.out.println("contain GCLID -> " + model.getUrl().toLowerCase().contains("gclid="));
            String formatted = model.getUrl().substring(model.getUrl().indexOf("gclid=") + 6, model.getUrl().length());
            service.addKey(formatted);
        }
        return "";
    }

    @RequestMapping(value = "/clearGcidTable", method = RequestMethod.POST)
    @ResponseBody
    public String clearGcidTable() {
        service.clearTable();
        return "";
    }

    @RequestMapping(value = "/getAllGclids", method = RequestMethod.POST)
    @ResponseBody
    public String getAllGclids() {
        ArrayList<String> gclidTickTimes = new ArrayList<>();
        String myTime1 = "13:06:02";
        String myTime2 = "13:07:34";
        gclidTickTimes.add(myTime1);
        gclidTickTimes.add(myTime2);

        LocalDateTime currentTime = LocalDate.now().atTime(13, 02, 22);
        System.out.println(currentTime);


        List<Gclid> allGClids = service.getAllGClids();
        ArrayList<Gclid> fullAllGclid = new ArrayList<>();
        for (Gclid gClid : allGClids) {
            gClid.setLocalDateTime(getLocalDateTime(gClid.getTime()));
            fullAllGclid.add(gClid);
        }

        for (String tickTime : gclidTickTimes) {
            LocalDateTime localTickTime = getLocalDateTime(tickTime);
            for (Gclid gclid : fullAllGclid) {
                LocalDateTime plus40Seconds = localTickTime.plusSeconds(40);
                LocalDateTime minus40Seconds = localTickTime.minusSeconds(40);
                if (plus40Seconds.isAfter(gclid.getLocalDateTime()) && minus40Seconds.isBefore(gclid.getLocalDateTime())) {
                    System.out.println(gclid + " -> " + "apply for " + tickTime);
                }
            }
        }

        return "";
    }

    private LocalDateTime getLocalDateTime(String tickTime) {
        String[] split = tickTime.split(":");
        return LocalDate.now().atTime(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
    }

}
