package com.Java_Technical;
//Here leading and trailing spaces are also replaced with a single space.
// You may want to completely remove any leading and trailing spaces and
// normalize the spaces in between the words for that you can use trim() method along with replaceAll().

public class StringSpaceRemoval {

    public static void main(String[] args) {

        String str = "     Example        String   ";

        System.out.println(str);
        // regex to match any number of spaces
        str = str.trim().replaceAll("\\s+", " ");
        System.out.println(str);

        System.out.println();
    }
}
