package com.wickedwitch.web;

import com.wickedwitch.model.Category;
import com.wickedwitch.model.Gif;
import com.wickedwitch.repository.CategoryRepository;
import com.wickedwitch.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ZuZ on 2016-11-06.
 */

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public ModelAndView getCategories(ModelMap modelMap) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("categories");
        modelAndView.addObject("categories", categoryRepository.findAllCategories());
        return modelAndView;
    }

    @RequestMapping("/category/{id}")
    public String getCategory(@PathVariable int id, ModelMap modelMap) {
        modelMap.put("gifs", gifRepository.findByCategory(id));
        modelMap.put("category", categoryRepository.findCategoryById(id));
        return "category";
    }

}

