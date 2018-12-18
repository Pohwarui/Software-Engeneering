package com.tiancheng.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AController {

    @RequestMapping("a")
    @ResponseBody
    public List<String> a(){
        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        return l;
    }
}
