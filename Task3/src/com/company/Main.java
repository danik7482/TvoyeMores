package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static void task5(int i, int x) {

        int sum = 0;
        for(int j = i; j <= x; j++) {
            sum += j;
        }
        System.out.println(sum);
    }
    public static void task6(int i, int x) {

        int sum = 0;
        for(int j = i; j <= x; j++) {
            sum += j;
        }

        if (sum % 3 == 0) {
            sum = sum * sum;
        }
        else if (sum % 3 == 1) {
            sum = sum * sum * sum;
            System.out.println(sum);
        }
        else {
            System.out.println(sum);
        }
    }
}
