package com.Java_Technical;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Toyota");
        cars.add(1,"volksvagon");
        cars.add(0,"Suzuki");
        cars.add("Nisan");

        for (String i:cars){

            System.out.println(i);



        }

        cars.add(3,"Alma");
        cars.add(4,"Bedam");

        for (String j: cars){

            System.out.println(j);
        }

        System.out.println(cars.size());
        System.out.println(cars.clone());
        System.out.println(cars.isEmpty());
        System.out.println(cars.contains("Alma"));
        System.out.println(cars.lastIndexOf("Alma"));
        System.out.println(cars.get(3));
        System.out.println(cars.iterator().next());
        cars.remove("Alma");
        System.out.println("--------------------------");
        for (String c: cars){
            System.out.println(c);
        }

        System.out.println(cars.contains("Alma"));
    }}

