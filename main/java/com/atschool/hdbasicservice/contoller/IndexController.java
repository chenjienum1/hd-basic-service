package com.atschool.hdbasicservice.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
这是包下是视图控制器，
 */
@Controller
public class IndexController {



    @RequestMapping("/index")
    public String index(){
        return "index";
    }


}

