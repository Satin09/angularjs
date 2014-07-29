package com.satin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 7/28/14.
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String returnIndex(){
        return "index";
    }


}
