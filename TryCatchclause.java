package com.Java_Technical;

public class TryCatchclause {
    //Exception doesn’t occur in try-block: In this case catch block never runs as they are only meant to be run when an exception occurs.
    // finally block(if present) will be executed followed by rest of the program.

    public static void main(String[] args) {

        try {

            String str = "123";

            int num = Integer.parseInt(str);

            // this statement will execute
            // as no any exception is raised by above statement
            System.out.println("Inside try block");

            System.out.println(num);

        } catch (NumberFormatException ex) {

            System.out.println("catch block executed...");

        }

        System.out.println("Outside try-catch clause");
    }
}
