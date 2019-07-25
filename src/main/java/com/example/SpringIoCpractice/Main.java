package com.example.SpringIoCpractice;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

//TODO
public class Main{


    public static void main(String[] args){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("hello.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        helloWorld.getHello();
    }
}