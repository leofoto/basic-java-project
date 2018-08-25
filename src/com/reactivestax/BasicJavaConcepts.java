package com.reactivestax;

import com.reactivestax.domain.Rectangle;
import com.reactivestax.domain.Shape;
import com.reactivestax.domain.Square;

public class BasicJavaConcepts {

    public static void main(String args[]) {
        //new style foreach loop
//        for (String arg : args) {
//            System.out.println("arg = " + arg);
//        }
//        //old style for loop with index iterator
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("i = " + args[i]);
//        }
        // instantiate and execute Square methods
//        Square square = new Square(10);
//        System.out.println(square.showClassDetails());
//        // instantiate and execute Square methods
//        Rectangle rectangle = new Rectangle(10, 20);
//        System.out.println(rectangle.showClassDetails());

        // polymorphism
//        Shape shapeHavingSquare;
//        shapeHavingSquare = new Square(10);
//
//        System.out.println("shapeHavingSquare = " + shapeHavingSquare.showClassDetails());
//        //
//        Shape shapeHavingRectangle;
//        shapeHavingSquare = new Rectangle(10, 20);
//        //
//        System.out.println("shapeHavingRectangle = " + shapeHavingSquare.showClassDetails());

        // polymorphism
        Shape shapeHavingSquare;
        shapeHavingSquare = new Square(10);

        System.out.println("shapeHavingSquare = " + shapeHavingSquare.showClassDetails());
        //
        Shape shapeHavingRectangle;
        shapeHavingRectangle = new Rectangle(10, 20);
        //
        System.out.println("shapeHavingRectangle = " + shapeHavingSquare.showClassDetails());
        //


    }

}
