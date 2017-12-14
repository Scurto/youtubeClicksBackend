package com.scurto.controller;

import com.scurto.model.TampermonkeyModel;
import com.scurto.service.GclidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
            String formatted  = model.getUrl().substring(model.getUrl().indexOf("?gclid=") + 7, model.getUrl().length());
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
}
