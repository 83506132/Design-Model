package com.muse.build.utils;

public class SingleSolidObject {
    private static Object object;

    public static Object getObject() {
        if (object == null) {
            synchronized (SingleSolidObject.class) {
                if (object == null) {
                    object = new Object();
                }
            }
        }
        return object;
    }
}
