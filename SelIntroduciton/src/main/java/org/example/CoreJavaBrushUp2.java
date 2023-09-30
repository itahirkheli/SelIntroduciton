package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {

        int[] arr2 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i] + " is Multiple of 2");
                break;
            }
            else
            {
                System.out.println(arr2[i] + " Is not multiple of 2");
            }
        }

        ArrayList<String> mylist = new ArrayList();

        mylist.add("First");
        mylist.add("Second");
        mylist.add("third");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
            System.out.println(mylist.contains("First"));
        }


        mylist.remove("First");
        for (String mystr:mylist
             ) {
            System.out.println(mystr);
        }

        String[] myNewString = {"Fist ", "Second"};

        List<String> nameArrayList = Arrays.asList(myNewString);
        
        System.out.println(nameArrayList.contains("Third"));
    }

}