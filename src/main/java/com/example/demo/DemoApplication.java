package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

//    public static void main(String[] args) {
////        SpringApplication.run(DemoApplication.class, args);
////        System.out.print("makuri");
////        System.out.println("Enter two numbers ");
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter first no");
////        int a = sc.nextInt();
////        System.out.println("Enter second no");
////        int b = sc.nextInt();
////        int sum = a + b;
////        System.out.println("the sum of the two numbers is= ");
////        System.out.print(sum);
//
//    }
    public static void main(String[] args){
        System.out.println("Enter the values of three numbers");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c =sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of three numbers"+ sum);
    }

}
