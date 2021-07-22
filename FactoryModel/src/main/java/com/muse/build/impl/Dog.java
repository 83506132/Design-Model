package com.muse.build.impl;

import com.muse.build.Animal;

public class Dog implements Animal {
    @Override
    public void draw() {
        System.out.println("狗的叫声:汪汪汪!");
    }
}
