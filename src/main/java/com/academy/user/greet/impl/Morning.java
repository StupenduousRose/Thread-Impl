package com.academy.user.greet.impl;

import com.academy.user.greet.Greet;



public class Morning implements Greet {
    @Override
    public void greeting() {
        System.out.println("Good Morning...Eka aro o, gbogbo ile.");
    }
}
