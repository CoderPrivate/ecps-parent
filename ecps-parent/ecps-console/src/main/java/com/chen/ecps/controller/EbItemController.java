package com.chen.ecps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/8.
 */
@Controller
@RequestMapping("/item")
public class EbItemController {
    @RequestMapping("/toIndex.do")
    public String toIndex(){
        System.out.println("已进入");
        return "item/index";
    }
}
