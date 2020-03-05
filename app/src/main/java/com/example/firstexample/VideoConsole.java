package com.example.firstexample;


public class VideoConsole {

    protected String company;
    protected String name;
    protected int imageResourceId;

    public VideoConsole (String company, String name, int imageResourceId) {
        this.company = company;
        this.name = name;
        this.imageResourceId = imageResourceId;
    } // end constructor

    public void setName(String name){
        this.name = name;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public String getConsoleName() {
        return this.name;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

} // end VideoConsole ()
