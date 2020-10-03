package com.Java_Technical;

import java.util.Scanner;

public class FibonacciSquence {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println(" Please enter range of fibonacci number: ");

        int sc=scan.nextInt();

        int a = 0;
        int b = 1;
        int c;
       // System.out.print(a + " " + b + " ");

        System.out.println(a+" " +b+ " ");

        for(int i = 2; i <=sc; i++) {

             c = a+b;

            a=b;

           b = c;
            System.out.print(c + "  ");

        }


    }
}
