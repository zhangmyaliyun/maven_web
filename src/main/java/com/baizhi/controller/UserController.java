package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //@ResponseBody
    @RequestMapping("selectAll")
    public String getUsers(ModelMap modelMap) {
        
        List<User> list = userService.selectAll();
        modelMap.addAttribute("list", list);
        return "forward:/index.jsp";
    }


}
