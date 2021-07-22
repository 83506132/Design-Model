package com.muse;

import com.muse.entity.User;

public class Main {
    public static void main(String[] args) {
        User user=new User(1,"赵有未");
        User clone = user.clone();
        System.out.println(clone);
    }
}
