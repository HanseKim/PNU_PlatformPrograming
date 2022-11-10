package com.bdobe;

public abstract class Shape {
    private int lineColor;
    int getLineColor(){
        return lineColor;
    }
    public abstract float getLength();
    public abstract void draw();
    public abstract float getArea();
}
