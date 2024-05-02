package com.example.customspringbootstater.service;

public class DislayServiceImpl implements DislayService{
    @Override
    public void dislay(String message) {
        System.out.println("Message : "+message);
    }
}
