package com.Java_Technical;

import java.util.Scanner;

public class CamelCaseSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z') count++;
        }
        System.out.println(count);
    }
}
