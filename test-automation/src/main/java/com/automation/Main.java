package com.automation;

public class Main {
    static String name = "Seth";
    static String formattedString;
    public static void main(String[] args) {
        System.out.println(String.format("Hello %s", name));
        System.out.println(formattedString);
        System.out.println(3);
        System.out.println(Calculator.add(4, 5));
    }
}