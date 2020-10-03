package com.Java_Technical;

public class TwoDimentionalArray {

    public static void main(String[] args){


        int[][] a={{10,20},{30,40},{50}};//declaration and initialization
        System.out.println("Two dimensional array elements are");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
