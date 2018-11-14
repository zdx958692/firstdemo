package com.saber.web.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author dongxu.zhang 3002691976@qq.com
 * @Description
 * @ClassName HelloConreoller
 * @Date Created in 18:34 2018-11-13
 */
//之前是RestController 导致无法跳转到页面
@Controller
@RequestMapping("view")
public class HelloConreoller {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}