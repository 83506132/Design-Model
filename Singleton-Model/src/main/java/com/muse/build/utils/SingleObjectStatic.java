package com.muse.build.utils;

public class SingleObjectStatic {
    private final static Object object=new Object();

    public static Object getObject() {
        return object;
    }
}
