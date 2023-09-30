package org.example;

public class CoreJavaBrushUp1 {

    public static void main(String[] args) {

        int myNum = 5;// priitive

        String mystring = "Rahul Shetty Academy"; //non primitive

        char mychar = 'r';

        double myfloat = 5.99;

        boolean mybol = true;

        System.out.println(myNum + " is the value stored in mynum");

        int[] myarr = new int[5] ;

        for (int i = 0; i < myarr.length; i++) {
            myarr[i] = i;

            System.out.println(myarr[i]);
        }

        String[] myName = {"First","Sec" ,"Third"};

        for (String myStr:myName) {

            System.out.println(myStr);

        }

    }
}
