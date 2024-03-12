package com.example.listpractice;

public class Model {
    int img;
    String name, contact;

    public Model(int img, String name, String contact) {
        this.img = img;
        this.name = name;
        this.contact = contact;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
