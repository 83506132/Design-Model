package com.muse.build;

import com.muse.build.utils.SingleObject;
import com.muse.build.utils.SingleObjectEmbedded;

public class AppConfig {
    public static void main(String[] args) {
        System.out.println(SingleObject.I.d== SingleObject.I.d);
    }
}
