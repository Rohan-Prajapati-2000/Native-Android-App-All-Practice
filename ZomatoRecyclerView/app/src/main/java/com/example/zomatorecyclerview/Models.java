package com.example.zomatorecyclerview;

public class Models {
    int img;
    String rName, fName, tDetail;

    public Models (int img, String rName, String fName, String tDetail) {
        this.img = img;
        this.rName = rName;
        this.fName = fName;
        this.tDetail = tDetail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String gettDetail() {
        return tDetail;
    }

    public void settDetail(String tDetail) {
        this.tDetail = tDetail;
    }
}
