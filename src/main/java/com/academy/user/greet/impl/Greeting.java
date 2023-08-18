package com.academy.user.greet.impl;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    public String sayHello(String name){
        return String.format("%s %s",
                "Welcome to Learning String Boot", name);
    }

    public void destroy(){
        System.out.println(this.getClass().getName()+" is being destroyed..");
    }

    public void init(){
        System.out.println(this.getClass().getName()+" is being initialized..");
    }
}

