package com.academy.user;

import com.academy.user.greet.Greet;
import com.academy.user.greet.impl.Afternoon;
import com.academy.user.greet.impl.Greeting;
import com.academy.user.greet.impl.Morning;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = {"myGreeting", "ourGreeting"}, initMethod = "init", destroyMethod = "destroy")
    public Greeting greeting(){
        return new Greeting();
    }
    @ConditionalOnProperty(name = "greet.day", havingValue = "morning", matchIfMissing = false)
    @Bean
    public Greet morning(){
        return new Morning();
    }

    @ConditionalOnProperty(name = "greet.day", havingValue = "afternoon", matchIfMissing = true)
    @Bean
    public Greet afternoon(){
        return new Afternoon();
    }

}
