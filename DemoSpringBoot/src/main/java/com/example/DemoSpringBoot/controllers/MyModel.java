package com.example.DemoSpringBoot.controllers;

public class MyModel {

    private String text;

    public MyModel(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
