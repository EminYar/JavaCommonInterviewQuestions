package com.Java_Technical;

public class remove_spaces {


    public static void main(String args[])
    {
        String str1 = "  Hello     World";
        System.out.println(str1);
        System.out.println(str1.trim());

        String str2 = "      Hey  there    Joey!!!      ";
        System.out.println(str2);
        System.out.println(str2.trim());
        System.out.println("-------------------------");

        String str = "  Hello    World		";
        str = str.replaceAll("\\s+", "");
        System.out.println("String- " + str);

        String string = "           Example   String   ";
        // regex to match any number of spaces
        string = string.replaceAll("\\s+", " ");
        System.out.println(string);
    }
}
