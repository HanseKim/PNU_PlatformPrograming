package com.cafe.order;

import com.cafe.menu.Beverage;
import com.cafe.menu.Blended;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public Object cost() {
        int sum=0;
        for(int i=0;i<items.size();i++){
            sum += items.get(i).beverage.getPrice()*items.get(i).quantity;
        }
        return (Integer) sum;
    }

    public boolean setSize(String name, String size) {
        int s,state=0;
        if(size.toUpperCase().equals("TALL")) s=0;
        else if(size.toUpperCase().equals("GRANDE")) s=1;
        else s = 2;
        for(OrderItem item : items){
            //주의
            if(item.beverage.getName().equals(name)){
                item.beverage.setSize(s);
                if(item.beverage.getClass()==Blended.class && s==0){
                    return false;
                }
                state=1;
            }
        }
        if(state==0) return false;
        else return true;
    }

    private Object toString(Beverage beverage) {
        return String.format("%s",beverage.getName());
    }

    public void print() {
        System.out.println();
        for(OrderItem item : items){
            System.out.print(item);
        }
        System.out.printf("Total: %,d\n",cost());
    }
}
