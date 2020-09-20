package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UmsMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @ResponseBody
    @RequestMapping("hello")
    public List<UmsMember> helloMember(){

        return umsMemberService.queryForAll();
    }
}
