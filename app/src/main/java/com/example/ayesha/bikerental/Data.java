package com.example.ayesha.bikerental;

/**
 * Created by Ayesha on 30-11-2017.
 */

public class Data {
    int id;
    String title;
    String details;
    int image;
    public Data() {
    }

    public Data(int id, String title, String details, int image) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImage(int position) {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}