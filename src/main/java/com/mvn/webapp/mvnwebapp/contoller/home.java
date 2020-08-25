package com.mvn.webapp.mvnwebapp.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class home {

//    @GetMapping("home")
//    public ModelAndView halaman(){
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("message","Jenkins");
//        return mv;
//    }
}
