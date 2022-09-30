package com.study.functions;
import java.util.Scanner;
//sum of two number.....

public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sumNum(num1, num2);
    }

    public static void sumNum(int num1, int num2){
        int sum = num1+num2;
        System.out.print(sum);
    }
}
