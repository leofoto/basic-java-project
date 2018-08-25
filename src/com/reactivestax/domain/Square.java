package com.reactivestax.domain;

import com.reactivestax.domain.Reporter;

public class Square extends Reporter {
    int sideLength;
    public static String NAME ;
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square() {

    }

    @Override
    public int calculateArea() {
        return sideLength * sideLength;
    }

    public int calculateArea(int newSideLength){
        return newSideLength * newSideLength;
    }


}
