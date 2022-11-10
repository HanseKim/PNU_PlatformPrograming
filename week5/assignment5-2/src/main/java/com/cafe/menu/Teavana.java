package com.cafe.menu;

public class Teavana extends Beverage{
    private int amount;

    public Teavana(String name) {
        super(name);
        super.basePrice = 4100;
    }
    public String toString(){
        return String.format("[ name=%s, Price=%d, size=%s, quantity=",name,super.getPrice(),"TALL");
    }
}
