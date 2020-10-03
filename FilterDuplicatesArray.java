package com.Java_Technical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FilterDuplicatesArray {

    public static void main(String[] argv) {
        List<Integer>list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(400);
        list1.add(500);
        list1.add(600);
        list1.add(600);
        list1.add(700);
        list1.add(400);
        list1.add(500);

        System.out.println("List with duplicate elements:");
        for (Object ob0: list1)
            System.out.println(ob0);
        System.out.println("--------------------");

        System.out.println(list1.size());
        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }




        HashSet<Integer>set = new HashSet<Integer>(list1);

//        List<Integer>list2 = new ArrayList<Integer>(set);
        System.out.println("List after removing duplicate elements:");
        for (Object ob: set)
            System.out.println(ob);
    }

        }