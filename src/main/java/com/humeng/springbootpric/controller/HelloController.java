package com.humeng.springbootpric.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author MengH
 * @date 2022/3/6 14:55
 * @JobNumber xxxxx
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
//    https://gitee.com/kuangstudy/kuang_livenote.git
}
