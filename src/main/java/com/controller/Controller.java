package com.controller;

import com.model.RegisterDto;
import com.model.SiteDto;
import com.model.TestModel;
import com.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by scurto on 10.04.2017.
 */
@CrossOrigin
@RestController
public class Controller {

    @Autowired
    private MyService testService;

    @RequestMapping("/api/test")
    public List<TestModel> getModelList() {
        return testService.findAllHardcoded();
    }

    @RequestMapping("/api/test2")
    public List<SiteDto> getJsonFromUrl() {
        return testService.getJsonFromUrl();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(RegisterDto registerDto) {
        System.out.println(registerDto.getEmail());
        System.out.println(registerDto.getPassword());
    }
}
