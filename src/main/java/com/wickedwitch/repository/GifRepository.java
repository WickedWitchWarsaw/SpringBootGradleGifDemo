package com.wickedwitch.repository;

import com.wickedwitch.model.Gif;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sun.net.www.content.image.gif;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZuZ on 2016-11-05.
 */

@Repository
public class GifRepository {
    private static List<Gif> allGifs = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2016, 10, 31), "xxx", false, 2),
            new Gif("ben-and-mike", LocalDate.of(2016, 10, 3), "Zuz", false, 1),
            new Gif("book-dominos", LocalDate.now(), "Jack", false, 2),
            new Gif("compiler-bot", LocalDate.of(2016, 6, 2), "Jill", true, 3),
            new Gif("cowboy-coder", LocalDate.now(), "wickedWitch", true, 1),
            new Gif("infinite-andrew", LocalDate.of(2016, 9, 1), "zzz", false, 1)
    );


    public List<Gif> findAllGif() {
        return allGifs;
    }

    public Gif findGifByName(String name) {
        for (Gif gif : allGifs) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }


    public List<Gif> findByCategory(int category) {
        List<Gif> tempListCat = new ArrayList<>();
        for (Gif gif : allGifs) {
            if (gif.getCategory() == category) {
                tempListCat.add(gif);
            }
        }
        return tempListCat;
    }
}
