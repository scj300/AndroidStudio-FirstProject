package com.example.firstexample;


public class VideoConsole {

    protected String company;
    protected String name;

    public VideoConsole (String company, String name) {
        this.company = company;
        this.name = name;
    } // end constructor

    public String getCompany() {
        return this.company;
    }

    public String getConsoleName() {
        return this.name;
    }

} // end VideoConsole ()
