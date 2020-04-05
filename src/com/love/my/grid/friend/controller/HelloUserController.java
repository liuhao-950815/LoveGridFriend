package com.love.my.grid.friend.controller;

import com.love.my.grid.friend.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloUserController {
    // 访问地址：http://localhost:8080/helloUser.form
    @RequestMapping(value = "/helloUser")

    // 将请求中的 username 参数的值赋给形参 userName，
    // 如果请求中 没有username 参数，那么 userName 默认为 “未传入username参数”。
    // defaultValue = "未传入username参数" 设置默认值
    public String handleRequest(Model model,@RequestParam(value = "username",
            defaultValue = "未传入username参数") String userName)
            throws Exception {
//        // 创建模型
//        ModelAndView modelAndView = new ModelAndView();
//
//        // 向 模型 中添加数据
//        modelAndView.addObject("message", "Hello," + request.getParameter("username") + "!");
//
//        // 返回逻辑视图
//        modelAndView.setViewName("/WEB-INF/jsp/helloUser.jsp");
//        return modelAndView;
        // 向 模型 中添加数据
        model.addAttribute("message", "Hello," + userName);

        return "helloUser";
    }

    @RequestMapping(value = "/addUser")
    public String handleReques(Model model, User user) throws Exception{
        // 将接受到的数据传过去
        model.addAttribute("user", user);
        System.out.println(user.toString());

        return "helloUser";
    }

}
