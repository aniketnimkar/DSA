package com.study.functions;
import java.util.Scanner;
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class factorial {
    public static int fact(int num){
        if(num==0 || num==10){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
}
