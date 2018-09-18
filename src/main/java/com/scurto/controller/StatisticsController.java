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

            switch (topStrategy.getTopStrategy()) {
                case "top5":
                    return getSortedList(baseList, 5);
                case "top10":
                    return getSortedList(baseList, 10);
                default:
                    return baseList;
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    private List<Website> getSortedList(ArrayList<Website> baseList, int limit) {
        List<Website> sortedList = new ArrayList<>();
        sortedList = baseList.stream()
                .filter(elem -> elem.getExecutionCount() != null)
                .sorted((f1, f2) ->  Integer.compare(f2.getExecutionCount(), f1.getExecutionCount()))
                .limit(limit)
                .collect(Collectors.toList());
        return sortedList;
    }
}
