package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Animal {

    private String name;

    public Animal() {
        System.out.println("contructor!!!!!!!!!!!");
    }

    /**
     * gọi sau khi tạo bean
     */
    @PostConstruct
    public void postContruct(){
        this.name = "hoang";

        System.out.println("post contruct");
    }

    public String getName() {
        return name;
    }

    /**
     * gọi trước khi destroy bean
     */
    @PreDestroy
    public void preDestriy(){
        System.out.println("pre destroy name :"+name);
    }

}
