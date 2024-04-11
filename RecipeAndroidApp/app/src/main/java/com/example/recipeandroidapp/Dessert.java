package com.example.recipeandroidapp;

public class Dessert {
    private int imageResource;
    private String dessertName;

    public Dessert(int imageResource, String dessertName) {
        this.imageResource = imageResource;
        this.dessertName = dessertName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDessertName() {
        return dessertName;
    }
}