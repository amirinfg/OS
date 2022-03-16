package com.amir;


import com.amir.spring.context.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;
import org.junit.jupiter.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    ApplicationContext context ;

    @Test
    public void init(){

    }

    @Test
    public void checkSingeltonInitStudent(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");
        Assertions.assertFalse(student==student1);



    }



}
