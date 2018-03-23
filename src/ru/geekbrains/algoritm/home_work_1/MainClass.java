package ru.geekbrains.algoritm.home_work_1;
/**
 * Породкин Олег
 */

import java.util.Scanner;

public class MainClass {


    static Scanner sk = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Задание 1 *С клавиатуры вводятся числовые координаты двух полей шахматной доски (x1,y1,x2,y2).
         * Требуется определить, относятся ли к поля к одному цвету или нет.
         * */

        int x1 = sk.nextInt();
        int y1 = sk.nextInt();
        int x2 = sk.nextInt();
        int y2 = sk.nextInt();

        System.out.println(isBlackOrWhite(x1, y1, x2, y2));

        /**
         * Задание 2
         * */

        /**
         * Задание 3
         * */

        long start = System.currentTimeMillis();
        int[] eratosInt = eratosfenNumber(10000);
        for (int i = eratosInt.length-1; i > 0; i--) {

            if (!(eratosInt[i] == -1)){
                System.out.println("Максимальное число эратосфена = " + eratosInt[i]);
                break;
            }

        }
        long timeMillis = System.currentTimeMillis() - start;
        System.out.println("Время выполнения программы: " + timeMillis + " миллисекунд");

        /**
         * 4. Реализовать алгоритм ускоренного возведения в степень.
         * */

        int numb = sk.nextInt();
        int power = sk.nextInt();

        System.out.println(fastPow(numb, power));

    }

    static long fastPow(int numb, int power) {

        long fp = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                power--;
                fp *= numb;
            } else {
                numb *= numb;
                power /= 2;
            }
        }
        return fp;
    }

    static int[] eratosfenNumber(int x) {

        int[] simpleNumber = new int[x];

        for (int i = 0; i < x; i++) {
            simpleNumber[i] = i + 1;
        }

        for (int i = 0; i < simpleNumber.length; i++) {

            if (simpleNumber[i] == 1) {
                simpleNumber[i] = -1;
                continue;
            }
            if (simpleNumber[i] > 0) {

                for (int j = i + 1; j < simpleNumber.length; j++) {

                    if (simpleNumber[j] % simpleNumber[i] == 0) simpleNumber[j] = -1;

                }
            }
        }
        return simpleNumber;
    }

    static boolean isBlackOrWhite(int x1, int y1, int x2, int y2) {

        return ((((x1 + y1) % 2) == 0) == (((x2 + y2) % 2) == 0));

    }

}
