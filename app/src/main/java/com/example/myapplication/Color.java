package com.example.myapplication;

public class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String showName()
    {
        return "The color "+name;
    }
}

