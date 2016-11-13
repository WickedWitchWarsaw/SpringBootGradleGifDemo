package com.wickedwitch.web;

import com.wickedwitch.repository.GifRepository;
import com.wickedwitch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ZuZ on 2016-11-05.
 */
@Controller
public class HomePageController {

    @Autowired
    private GifRepository gifRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public ModelAndView listGifs() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("gifs", gifRepository.findAllGif());
        return modelAndView;
    }

    @RequestMapping("/users")
    public ModelAndView listUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        modelAndView.addObject("users", userRepository.getAllUsers());
        return modelAndView;
    }
}