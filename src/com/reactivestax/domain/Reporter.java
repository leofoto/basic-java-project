package com.reactivestax.domain;

public abstract class Reporter implements Shape  {
    @Override
    public String showClassDetails() {
        return "Aman: I am a shape class, my area is " + calculateArea();
    }

    protected abstract int calculateArea();
}
