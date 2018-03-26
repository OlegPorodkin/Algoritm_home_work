package ru.geekbrains.algoritm.home_work_2;

import java.util.Arrays;

/**
 * Породкин Олег
 */

public class AlgHomeWork2 {

    public static void main(String[] args) {
        //задание 1
        int n = 8;
        int[] binary = new int[n];
        toBinar(25, binary, n - 1);
        System.out.println(Arrays.toString(binary));

        //задание 2
        System.out.println(intPowNotRec(2, 5));
        System.out.println(intPowRec(2, 5));
    }

    // Задание 1
    static void toBinar(int x, int[] s, int end) {
        s[end] = x % 2;
        if (end > 0) {
            toBinar(x / 2, s, --end);
        }
    }

    // Задание 2
    static int intPowNotRec(int x, int y) {

        int w = x;
        while (y > 1) {
           w*=x;
           y--;
        }
        return w;
    }

    static int intPowRec(int num, int pow) {
        int x = 2;
        if (pow>1)
            return intPowRec(num * x,pow-1);
        else return 0;
    }

    // Задание 3


}
