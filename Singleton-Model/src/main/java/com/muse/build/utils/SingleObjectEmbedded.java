package com.muse.build.utils;

public class SingleObjectEmbedded {
    static class S{
        static {
            System.out.println("我被加载");
        }
        private static final Object object=new Object();
    }
}
