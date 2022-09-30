package com.study.functions;
import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.

public class sumOfNum {
    static int sum(int num){
        int count=0;
        for(int i=1;i<=num; i++)
            count=count+i;
        return count;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num= sc.nextInt();
        int num = 5;
        System.out.println(sum(num));

    }

}
