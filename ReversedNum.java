package com.Java_Technical;

import java.util.Scanner;

public class ReversedNum {
    public static void main(String[] args){

        Scanner sc1=new Scanner(System.in);

        System.out.println("  enter your Number:    ");
        int numberToReverse=sc1.nextInt(); //your number

        StringBuilder sb=new StringBuilder();
        sb.append(numberToReverse);
        sb=sb.reverse();
        String intermediateString=sb.toString();
        int reversedNumber=Integer.parseInt(intermediateString);

        System.out.println(reversedNumber);


    }
}
