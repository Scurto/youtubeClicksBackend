package com.scurto.controller;

import com.scurto.model.Website;
import com.scurto.model.statistics.TopStrategy;
import com.scurto.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/statistics")
@CrossOrigin
public class StatisticsController {

    @Autowired
    private StatisticsService service;

    @RequestMapping(value = "/listWebsites", method = RequestMethod.POST)
    @ResponseBody
    public List<Website> getWebsites(@RequestBody TopStrategy topStrategy) {
        try {
            ArrayList<Website> baseList = (ArrayList<Website>) service.getWebsites();
            System.out.println(topStrategy.getTopStrategy());
            List<Website> sortedList = new ArrayList<>();
            switch (topStrategy.getTopStrategy()) {
                case "top5":
                    sortedList = baseList.stream()
                            .filter(elem -> elem.getExecutionCount() != null)
                            .sorted((f1, f2) ->  Integer.compare(f2.getExecutionCount(), f1.getExecutionCount()))
                            .limit(2)
                            .collect(Collectors.toList());
                    return sortedList;
                case "top10":

                    break;
                default:
                    return sortedList;
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
