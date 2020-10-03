package com.Java_Technical;

import java.util.StringTokenizer;

public class removeExtraSpaces {

    public static void main(String[] args) {

        String input = "Try     to       remove       extra        spaces.";

        StringTokenizer substr = new StringTokenizer(input, " ");

        StringBuilder sb = new StringBuilder();

        while (substr.hasMoreElements()) {

            sb.append(substr.nextElement()).append(" ");

        }
        System.out.println("Actual string: " + input);

        System.out.println("Processed string: " + sb.toString().trim());
    }
}
