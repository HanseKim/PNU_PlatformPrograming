package com.cafe.order;

import com.cafe.menu.Beverage;

public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;this.quantity = quantity;
    }
    public String toString(){
        return String.format("%s%d ]\n",beverage,quantity);
    }
}



