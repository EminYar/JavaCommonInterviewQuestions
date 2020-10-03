package com.Java_Technical;

public class tryfinally {

    //In this case, no matter whether an exception occur in try-block or not,
    // finally will always be executed. But control flow will depend on
    // whether exception has occurred in try block or not.
    //Exception raised: If an exception has occurred in try block then control
    // flow will be finally block followed by default exception handling mechanism.
    public static void main (String[] args)
    {

        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];

            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }

        finally
        {
            System.out.println("finally block executed");
        }

        // rest program will not execute
        System.out.println("Outside try-finally clause");
    }
}
