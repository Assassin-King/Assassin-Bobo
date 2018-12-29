package com.springboot.assassin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 测试
 *
 * @author WangYB
 * @Company 易尊通信
 * @create 2018-12-29 9:41
 */
@Controller
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = {"index","","/"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "now")
    @ResponseBody
    public Date getCurrentTime(){
        return new Date();
    }

    @RequestMapping(value = "log")
    @ResponseBody
    public String  testLog(){
        logger.info("=========info create=======");
        logger.error("=========error:{}","波波");
        return "success";
    }
}
