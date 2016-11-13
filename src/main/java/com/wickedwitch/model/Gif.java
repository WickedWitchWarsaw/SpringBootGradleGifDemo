package com.wickedwitch.model;

import java.time.LocalDate;

/**
 * Created by ZuZ on 2016-11-05.
 */
public class Gif {

    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;
    private int category;


    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int category) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
        this.category = category;
    }


    public Gif() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
