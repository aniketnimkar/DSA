package com.study.functions;
//Define a method to find out if a number is prime or not.

public class isPrime {
    static boolean prime(int n){
        if(n<=1)
            return false;

        for(int i=2; i<n; i++)
            if (n%i==0)
                return false;
        return true;
        }

        public static void main (String[]args){
        if(prime(15)){
            System.out.println(true);
        }else System.out.println(false);
        if(prime(1)){
            System.out.println(true);
        }else System.out.println(false);
        }
    }
