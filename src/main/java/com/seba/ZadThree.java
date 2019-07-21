package com.seba;

public class ZadThree {
    private String text;

    public ZadThree(String text) {
        this.text = text;
    }

    public ZadThree() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void initZad(){
        System.out.println("Hi");
    }

    public void destroyZad(){
        System.out.println("Bye");
    }

}
