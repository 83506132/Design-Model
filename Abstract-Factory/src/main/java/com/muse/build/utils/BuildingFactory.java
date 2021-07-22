package com.muse.build.utils;

import java.util.Objects;

public class BuildingFactory extends AbstractBuildingFactory {
    @Override
    public Color getColor(String name) {
        Color color = null;
        if (name == null) {
        } else {
            name = name.toLowerCase();
            if (Objects.equals("red", name)) {
                color = new Red();
            } else if (Objects.equals("blue", name)) {
                color = new Blue();
            } else if (Objects.equals("black", name)) {
                color = new Black();
            }
        }
        if (color == null) {
            throw new RuntimeException("你输入的参数有误");
        }
        return color;
    }

    @Override
    public Shape getShape(String name) {
        Shape shape = null;
        if (name == null) {
        } else {
            name = name.toLowerCase();
            if (Objects.equals("round", name)) {
                shape = new Round();
            } else if (Objects.equals("square", name)) {
                shape = new Square();
            } else if (Objects.equals("triangle", name)) {
                shape = new Triangle();
            }
        }
        if (shape == null) {
            throw new RuntimeException("你输入的参数有误");
        }
        return shape;
    }
}
