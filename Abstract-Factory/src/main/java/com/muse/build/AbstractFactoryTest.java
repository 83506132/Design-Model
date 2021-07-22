package com.muse.build;

import com.muse.build.utils.AbstractBuildingFactory;
import com.muse.build.utils.BuildingFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractBuildingFactory factory=new BuildingFactory();
        factory.getColor("red").fill();
        factory.getColor("red").fill();
    }
}
