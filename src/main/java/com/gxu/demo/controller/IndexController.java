package com.gxu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author LLM
 * @Date 2019/12/22 10:33
 * @Version 1.0
 **/

@Controller
public class IndexController {

    //产品大数据首页
    @GetMapping("/hello")
    public ModelAndView DataShow(HttpServletRequest request, HttpServletResponse response, Model model) {

        return new ModelAndView("hello");
    }
}
