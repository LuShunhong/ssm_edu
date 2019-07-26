package org.hong.edu.web.controller;

import org.hong.edu.model.User;
import org.hong.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/find")
    public String find(Integer id){
        System.out.println("find成功执行");
        User user = userService.findById(id);
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("login成功执行");
        return "success";
    }
}
