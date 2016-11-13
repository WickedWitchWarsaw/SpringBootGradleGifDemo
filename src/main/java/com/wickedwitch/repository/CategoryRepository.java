package com.wickedwitch.repository;

import com.wickedwitch.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZuZ on 2016-11-06.
 */

@Repository
public class CategoryRepository {
    public static List<Category> categoryList = Arrays.asList(
            new Category(1, "Funny"),
            new Category(2, "Pointless"),
            new Category(3, "Hilarious")
    );

    public List<Category> findAllCategories() {
        return categoryList;
    }

    public Category findCategoryById(int id) {
        for (Category category : categoryList) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
