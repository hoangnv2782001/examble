package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component("cho")
@Service
@Repository
@RestController
public class Animal implements AnimalI{

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

    @Override
    public void sua(){
        System.out.println("gau gau gau");
    }


    /**
     * gọi trước khi destroy bean
     */
    @PreDestroy
    public void preDestriy(){
        System.out.println("pre destroy name :"+name);
    }

}
