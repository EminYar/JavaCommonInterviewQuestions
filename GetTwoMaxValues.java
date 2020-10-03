package com.Java_Technical;

import java.util.Arrays;

public class GetTwoMaxValues {


    public static void main(String[] args) {

        int[] nums1 = {23, 4, 55, 666, 7777000, 8999, 9998, 78890};

        GetTwoMaxValues1(nums1);

    }

    private static void GetTwoMaxValues1(int[] nums) {

        Arrays.sort(nums);
        System.out.println("Max1 - " + (nums[nums.length - 1]));
        System.out.println("Max2 - " + (nums[nums.length - 2]));

    }
}