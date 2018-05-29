package com.song.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 官方示例工程中的测试代码
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/index")
    @ResponseBody
    String home(String num) {
        return "Hello World!"+ num ;
    }
    @RequestMapping("/ss/{num}")
    @ResponseBody
    String homes(@PathVariable String num) {
        return "s"+ num;
    }

   public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}