package com.wickedwitch.web;

import com.wickedwitch.model.Gif;
import com.wickedwitch.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by ZuZ on 2016-11-05.
 */

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/gif/{name}")
    public String getGif(@PathVariable String name, ModelMap model) {
        Gif gif = gifRepository.findGifByName(name);
        model.put("gif", gif);
        return "gif-details";
    }
}
