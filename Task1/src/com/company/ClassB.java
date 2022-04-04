package com.company;

public class ClassB {

    public static void main(String[] args) {
        abs(-8);
    }

    public static void abs(int x) {
        int m = 0;

        if (x < 0) {
            m = x + x + x;
        }
        else if( x > 0) {
            m = x;
        }
        System.out.println(m);
    }
}
