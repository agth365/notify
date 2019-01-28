package com.agth.notify.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/notify")
public class NotifyController {

    @RequestMapping(name = "/hnpay", method = {RequestMethod.POST, RequestMethod.GET})
    public String hnpay() {

        return "200";
    }

}
