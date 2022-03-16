package com.amir.spring.context;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {

    @Value("30")
    private int age;
    @Value("A")
    private String name;
    @Value("B")
    private String family;
    @Autowired()
    private Book book;

    public void createObject(){
        System.out.println("Object Created By Info");
        System.out.println(this.toString());
        System.out.println();
    }

    public void destroyObject(){
        System.out.println("Object Destroy By Info");
        System.out.println(this.toString());
        System.out.println();
    }



}
