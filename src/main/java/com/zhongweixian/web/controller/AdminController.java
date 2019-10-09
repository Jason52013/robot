package com.zhongweixian.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by caoliang on 2019-09-16
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(AdminController.class);


    @GetMapping("")
    public ModelAndView page(){
        return new ModelAndView("/common/main");
    }
}
