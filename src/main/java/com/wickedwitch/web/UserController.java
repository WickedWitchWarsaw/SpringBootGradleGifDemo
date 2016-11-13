package com.wickedwitch.web;

import com.wickedwitch.model.User;
import com.wickedwitch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

/**
 * Created by ZuZ on 2016-11-05.
 */

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user")
    public String singleUser(ModelMap modelMap) {
        List<User> users = userRepository.getAllUsers();
        modelMap.put("users", users);
        return "users";
    }


//    @RequestMapping("/user/{id}")
//    public String getUser(@PathVariable int id, ModelMap modelMap){
//        User user = userRepository.getUserById(id);
//        modelMap.put("user", user);
//        return "user";
//    }

//
//    @RequestMapping("/user/{id}")
//    public String getUser(@PathVariable int id, ModelMap modelMap,
//        @RequestParam(name = "ksywka", defaultValue = "") String ksywkaValue) {
//        User user = userRepository.getUserById(id);
//        modelMap.put("user", user);
//        modelMap.put("ksywka", ksywkaValue);
//        return "user";
//    }


    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable int id, ModelMap modelMap,
                          @RequestParam(name = "ksywka", defaultValue = "") String ksywkaValue,
                          @RequestParam(name = "losuj", defaultValue = "false") Boolean losujValue) {
        User user = userRepository.getUserById(id);
        modelMap.put("user", user);
        modelMap.put("ksywka", ksywkaValue);

        if (losujValue) {
            Random random = new Random();
            int result = random.nextInt(101);
            modelMap.put("id", result);

        } else {
            modelMap.put("id", user.getId());
        }
        return "user";
    }
}
