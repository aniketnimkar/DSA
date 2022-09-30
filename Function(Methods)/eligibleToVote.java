package com.study.functions;
import java.util.Scanner;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class eligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(vote(age));
    }
    public static String vote(int age){
        if(age>=18){
            return ("Eligible");
        }
        else{
            return ("not eligible");
        }
    }
}
