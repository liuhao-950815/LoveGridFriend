package com.love.my.grid.friend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HelloWorldController  {

    @RequestMapping("helloWorld")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model)
            throws Exception {
//        // 创建模型
//        ModelAndView modelAndView = new ModelAndView();
//
//        // 向模型中添加数据
//        modelAndView.addObject("message", "Hello World");
//
//        // 返回逻辑视图
//        modelAndView.setViewName("/WEB-INF/jsp/helloWorld.jsp");
//        return modelAndView;
        // 向 模型 中添加数据
        model.addAttribute("message", "Hello World");

        // 自动添加前缀和后缀 ，相当于 /WEB-INF/jsp/helloWorld.jsp
        // 前缀后缀在视图解析器中配置
        return "helloWorld";
    }

}
