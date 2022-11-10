package com.cafe.menu;

public class Blended extends Beverage{
    private int baseAmount;

    public Blended(String name) {
        super(name);
        super.basePrice = 6800;
    }
    @Override
    public void setSize(int size){
        if(size==0) return ;
        super.size = size;
    }
    public String toString(){
        return String.format("[ name=%s, Price=%d, size=%s, quantity=",name,super.getPrice(),"GRANDE");
    }
}
