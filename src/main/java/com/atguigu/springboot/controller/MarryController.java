package com.atguigu.springboot.controller;


import com.atguigu.springboot.exception.UserNotExistException;
import com.atguigu.springboot.service.MarryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("/marry")
public class MarryController {

    @Autowired
    private MarryService marryService;

    @GetMapping(value = "/search")
    @ResponseBody
    public  String hello(@RequestParam("Search") String search){
        if(search.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }





}
