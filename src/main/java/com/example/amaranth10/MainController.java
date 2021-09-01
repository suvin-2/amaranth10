package com.example.amaranth10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = {"/"},method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String index() throws Exception {


        return "Hello !";
    }
}