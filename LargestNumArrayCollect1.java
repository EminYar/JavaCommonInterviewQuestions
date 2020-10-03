package com.Java_Technical;

public class LargestNumArrayCollect1 {


    public static void main(String[] args) {

        int[] arr = {1, 3, 67, 89, 90, 87, 57, 44, 200, 777, 6888, 980};

       // int total=arr.length - 1;

        System.out.println(getLargest(arr, arr.length - 1));

    }

    public static int getLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 1];
    }
}