package com.Java_Technical;

import java.util.Arrays;
// we can not give Array name for a class

public class ArraysDemo {

    public static void main(String[] args) {


        int[] c = new int[]{10000, 21111, 300000, 4124, 199, 1999, 2000, 405065};

        Arrays.sort(c);

// finding  the second largest number is the array
        System.out.println(c[c.length - 2]);

        System.out.println(c[1]);

        int[][] Results = {{1, 12, 3, 4, 4, 5}, {2, 3, 4, 5, 5, 6, 100, 1223, 12234}};

        System.out.println(Results[1][8]);

        //
        int[][] myNumbers = {
                {1, 2, 3, 4},
                {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

//        myNumbers[0][0]=1;
//        myNumbers[1][0]=5;
//
//        myNumbers[1][0]=2;
//
//        myNumbers[0][2]=3;
//        myNumbers[0][3]=4;

        System.out.println(myNumbers[0][2]);

        System.out.println(myNumbers[1][2]);

        System.out.println(myNumbers[0][2]);
        System.out.println(myNumbers[1][0]);
        System.out.println(myNumbers[0][3]);

        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);

        System.out.println("Number of rows: " + myNumbers.length);
        System.out.println("Number of columns: " + myNumbers[0].length);

// in this case we take 3 column, two rows.
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
System.out.println(myNumbers[row][column]);
            }
        }
    }
}
