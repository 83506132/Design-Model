package com.muse.build.impl;

import com.muse.build.Animal;

import java.util.Objects;

public class AnimalBeanFactory {
    public Animal getBean(String objName) {
        Animal animal = null;
        if (Objects.equals(objName, "狗")) {
            animal = new Dog();
        } else if (Objects.equals(objName, "猪")) {
            animal = new Pig();
        }
        return animal;
    }
}
