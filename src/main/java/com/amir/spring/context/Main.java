package com.amir.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");

        student.destroyObject();
        student1.destroyObject();



    }
}

//
//package com.amir;
//
//
//        import java.sql.*;
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
////        try {
////            Class.forName("oracle.jdbc.driver.OracleDriver");
////        } catch (ClassNotFoundException ex) {
////            System.out.println("Error: unable to load driver class!");
////            System.exit(1);
////        }
////
////        Driver myDriver = null;
////        try {
////            myDriver = new OracleDriver();
////            DriverManager.registerDriver(myDriver);
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////
////        Connection connection = myDriver.get
////
//
//
//        List<Student> students = null;
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", "dev3", "dev3");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from STUDENT");
//            students = new ArrayList<>();
//            while (resultSet.next()) {
//                Student student = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
//                students.add(student);
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//
//    }
//}
//
