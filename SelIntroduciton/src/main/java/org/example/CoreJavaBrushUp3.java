package org.example;

import java.util.Arrays;

public class CoreJavaBrushUp3
{
    public static void main(String[] args) {

        String s1 = "Fist";
        String s2 = "Fist is very good";

        String[] s3 =s2.split(" ");

        for (String mystr:s3
             ) {
            System.out.println(mystr.trim());


        }


        for (int i = 0; i < s2.length(); i++) {

            System.out.println(s2.charAt(i));

        }

        for (int i = s2.length()-1; i>=0; i--) {

            System.out.println(s2.charAt(i));

        }
    }
}
