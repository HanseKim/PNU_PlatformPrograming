package com.bdobe;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public float getLength(){
        return (float)width*2 + (float)height*2;
    }
    @Override
    public void draw(){
        System.out.printf("Rectangle,Area: %.2f, Length: %.2f\n",getArea(),getLength());
    }
    @Override
    public float getArea(){
        return (float) width *(float) height;
    }
}
