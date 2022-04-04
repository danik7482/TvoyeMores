package com.company;

public class Main {

    public static void main(String[] args) {
        whatIsANumber(88);
        abs(-6);
        square(2);
        method1(8, 2);
    }

    public static void abs(int x) {
        if (x < 0) {
            System.out.println("|" + x + "|" + " = " + -x);
        }
        else {
            System.out.println("|" + x + "|" + " = " + x);
        }
    }
    public static void whatIsANumber(int x) {
        if (x > 0) {
            System.out.println("X > 0");
        }
        else if(x < 0) {
            System.out.println("X < 0");
        }
        else
            System.out.println("X = 0");
    }
    public static void square(double radius) {
        double a = Math.PI * radius * radius;
    }
    //Цей метод виводить на еран true, якщо а - b > 0, інакше - false
    //можна записати так: public boolean b = (a - b > 0); System.out.println(b);
    public static void method1(int a, int b) {
        System.out.println(a - b > 0);
    }
}
