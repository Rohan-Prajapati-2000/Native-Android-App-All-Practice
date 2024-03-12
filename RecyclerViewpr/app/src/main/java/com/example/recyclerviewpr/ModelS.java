package com.example.recyclerviewpr;

public class ModelS {
    int img;
    String name, state;

    public ModelS(int img, String name, String state) {
        this.img = img;
        this.name = name;
        this.state = state;
    }

    public ModelS(String name, String state) {
        this.name = name;
        this.state = state;
    }
}
