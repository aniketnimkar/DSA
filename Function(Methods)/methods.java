package com.study.functions;
import java.util.*;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class methods {
    public static int largest(int first, int second, int third){
        int max = first;
        if(max<second){
            max = second;
        }
        if(max<third){
            max = third;
        }
        return max;
    }

    public static int smallest(int first, int second, int third){
        int min = first;
        if(second<min){
            min= second;
        }
        if(third<min){
            min= third;
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int largest =largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.println(largest);
        System.out.println(smallest);
    }
}

