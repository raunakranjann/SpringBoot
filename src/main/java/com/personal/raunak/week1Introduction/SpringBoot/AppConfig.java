package com.personal.raunak.week1Introduction.SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Apple getApple(){
        return new Apple();
    }

}
