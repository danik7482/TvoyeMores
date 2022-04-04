package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    }

    public static void task151(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
    public static void task152(int a) {
        int[] array = new int[a];

        int sum = 0;
        for (int i = 0; i < array.length; i+= 2) {
                sum += array[i];
        }

        System.out.println(sum);
    }

    public static void task153(int a) {
        int[] array = new int[a];

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max1) {

            }
        }
        System.out.println();
    }
}
