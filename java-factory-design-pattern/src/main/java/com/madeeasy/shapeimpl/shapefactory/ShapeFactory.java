package com.madeeasy.shapeimpl.shapefactory;

import com.madeeasy.Shape;
import com.madeeasy.shapeimpl.Circle;
import com.madeeasy.shapeimpl.Rectangle;

public class ShapeFactory {
    public Shape createShape(String shapeType){
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
