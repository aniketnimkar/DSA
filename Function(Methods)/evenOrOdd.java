package com.study.functions;
import java.util.*;
//Define a program to find out whether a given number is even or odd.
public class evenOrOdd {
    public static void main(String[] args) {
       evenOrOdd();
        evenOrOdd();evenOrOdd();

    }
     static void evenOrOdd(){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         if(num%2==0){
             System.out.println("no us even");
         }
         else{
             System.out.println("no is odd");
         }
     }
}
