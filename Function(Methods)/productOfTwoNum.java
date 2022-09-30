package com.study.functions;
import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.

public class productOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        product(num1, num2);
    }
    static void product(int num1, int num2){
        int sum= num1*num2;
        System.out.println(sum);
    }
}
