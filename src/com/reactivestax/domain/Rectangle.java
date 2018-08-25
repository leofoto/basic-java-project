package com.reactivestax.domain;

public class Rectangle extends Reporter implements Shape {
    int length;
    int breadth;

    @Override
    public int calculateArea() {
        return length * breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}
