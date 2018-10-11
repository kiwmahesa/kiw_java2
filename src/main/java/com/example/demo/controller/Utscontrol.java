package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("Uts")
public class Utscontrol {
    @RequestMapping(value = {"/",""}, method = RequestMethod.GET)
    public String index() { return "Uts/uts";}
}
