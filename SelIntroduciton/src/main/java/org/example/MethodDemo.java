package org.example;

public class MethodDemo
{
    public static void main(String[] args) {
    MethodDemo obj = new MethodDemo();
    System.out.println(obj.getData());

        System.out.println(getData2());

    MethodDemo2 obj2 = new MethodDemo2();
        System.out.println(obj2.getData());
        }
    public String getData(){
        return "calling form demo Hello world ";
    }

    public static String getData2(){
        return "calling from static Hello world 2";
    }
}
