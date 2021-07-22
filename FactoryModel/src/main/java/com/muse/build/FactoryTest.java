package com.muse.build;

import com.muse.build.impl.AnimalBeanFactory;

public class FactoryTest {
    public static void main(String[] args) {
        AnimalBeanFactory factory=new AnimalBeanFactory();
        Animal pig = factory.getBean("猪");
        pig.draw();
    }
}
