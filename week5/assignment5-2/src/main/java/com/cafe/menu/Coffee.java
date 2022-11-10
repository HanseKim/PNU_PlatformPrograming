package com.cafe.menu;

public class Coffee extends Beverage{
    private int defaultShot;
    public Coffee(String name) {
        super(name);
        super.basePrice = 4100;
    }
    @Override
    public void setSize(int size){
        super.size = size;
    }
    public String toString(){
        return String.format("[ name=%s, Price=%d, size=%s, quantity=",name,super.getPrice(),getSize());
    }
}
