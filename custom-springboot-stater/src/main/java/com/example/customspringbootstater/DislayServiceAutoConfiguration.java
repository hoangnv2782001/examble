package com.example.customspringbootstater;


import com.example.customspringbootstater.service.DislayService;
import com.example.customspringbootstater.service.DislayServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(DislayService.class)
public class DislayServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DislayService helloService(){

        return new DislayServiceImpl();
    }
}