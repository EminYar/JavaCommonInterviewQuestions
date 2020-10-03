package com.Java_Technical;

public class SwapTwoNumbers {

public static void main(String[] args){

    int x=5;
    int y=10;

    //x=10,y=5
    //1. with third variable: t

    int t;
    t=x;//5
    x=y;  //10

    y=t;  //5

    //2. withought using third variable, using +operator

    x=x+y;   //15

    y=x-y; //5

    x=x-y;  //10

    //3. without using third variable: using * operator

    x=x*y;  //50

    y=x/y;  //5

    x=x/y;  //10

    //.using  zor ^

    x=x^y;  //15--->1111
    y=x^y;  //10 ---->1010

    x=x^y;   //5---->0101

    System.out.println(x);

    System.out.println(y);






}
}
