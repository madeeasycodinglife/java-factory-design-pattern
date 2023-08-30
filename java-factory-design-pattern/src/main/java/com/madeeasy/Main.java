package com.madeeasy;

import com.madeeasy.shapeimpl.shapefactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Create Circle
        Shape circle = factory.createShape("Circle");
        circle.draw(); // Output: Drawing a Circle

        // Create Rectangle
        Shape rectangle = factory.createShape("Rectangle");
        rectangle.draw(); // Output: Drawing a Rectangle
    }
}