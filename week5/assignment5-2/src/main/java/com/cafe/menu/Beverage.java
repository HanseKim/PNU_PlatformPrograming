package com.cafe.menu;

public class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    private String name; int basePrice; int size;

    public Beverage(String name) {
        this.name = name;
    }

    public String getSize(){
        if(size==0) return "TALL";
        if(size==1) return "GRANDE";
        else return "VENTI";
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return basePrice + 500*size;
    }
}
