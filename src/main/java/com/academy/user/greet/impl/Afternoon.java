package com.academy.user.greet.impl;

import com.academy.user.greet.Greet;


public class Afternoon implements Greet {
    @Override
    public void greeting() {
        System.out.println("Good Afternoon... Ekaa san o");
    }
}
