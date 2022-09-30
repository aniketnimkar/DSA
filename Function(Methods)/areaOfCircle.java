package com.study.functions;
import java.util.Scanner;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius");
        double radius = sc.nextDouble();
        area(radius);
        circumference(radius);

    }
    static void area(double radius){
        double ar= Math.PI * (radius*radius);
        System.out.println("area of given radius is: "+ar);
    }
    static void circumference(double radius){
        double cir= Math.PI * 2 * radius;
        System.out.println("circumference of given radius is:"+ cir);
    }

}
