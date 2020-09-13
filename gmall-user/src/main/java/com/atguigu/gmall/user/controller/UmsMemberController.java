package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UmsMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @ResponseBody
    @RequestMapping("hello")
    public String helloMember(){

        return "hello member";
    }
}
