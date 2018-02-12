package com.scurto.controller;

import com.scurto.model.Gclid;
import com.scurto.model.TampermonkeyModel;
import com.scurto.service.GclidService;
import com.scurto.service.jms.GclidJmsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by yustymenko on 13.12.2017.
 */
@RestController
@RequestMapping(value = "/gclid")
@CrossOrigin
public class GclidController {

    @Autowired
    private GclidService service;

    @Autowired
    private Queue queue;

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping(value = "/getTampermonkeyGClid", method = RequestMethod.POST)
    @ResponseBody
    public String getTampermonkeyGclid(@RequestBody TampermonkeyModel model) {

        System.out.println("MODEL -> " + model);
        if (model.getUrl() != null && model.getUrl().toLowerCase().contains("gclid=")) {
            String formatted = model.getUrl().substring(model.getUrl().indexOf("gclid=") + 6, model.getUrl().length());
            System.out.println("GCLID -> " + formatted);
            System.out.println("At time  -> " + LocalDateTime.now());
            //            service.addKey(formatted);
        }
        return "response";
    }

    @RequestMapping(value = "/callJms", method = RequestMethod.GET)
    @ResponseBody
    public String testJMS() {
        for (int j = 0; j < 10; j++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 999999999 + 1);
            GclidJmsModel jms = new GclidJmsModel();
            jms.setTime(LocalDateTime.now().toString());
            jms.setGclid(String.valueOf(randomNum));
            jmsTemplate.convertAndSend(queue, jms);
        }
        return "";
    }

    @RequestMapping(value = "/getJms", method = RequestMethod.GET)
    @ResponseBody
    public String receiveMessage() {
        Object message = jmsTemplate.receiveAndConvert(queue);
        GclidJmsModel jms = (GclidJmsModel) message;
        return "Response -> " + jms;
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
