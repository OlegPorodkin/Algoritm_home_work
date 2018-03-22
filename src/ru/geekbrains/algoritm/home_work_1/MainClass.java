package ru.geekbrains.algoritm.home_work_1;
/**
 * Породкин Олег
 * */

import java.util.Scanner;

public class MainClass {



    static Scanner sk = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * 4. Реализовать алгоритм ускоренного возведения в степень.
         * */

        int numb = sk.nextInt();
        int power = sk.nextInt();

        System.out.println(fastPow(numb, power));


        /**
         * Задание 1 *С клавиатуры вводятся числовые координаты двух полей шахматной доски (x1,y1,x2,y2).
         * Требуется определить, относятся ли к поля к одному цвету или нет.
         * */

        int x1 = sk.nextInt();
        int y1 = sk.nextInt();
        int x2 = sk.nextInt();
        int y2 = sk.nextInt();

        System.out.println(isBlackOrWhite(x1, y1, x2, y2));



    }

    static long fastPow(int numb, int power){

        long p = 1;
        while (!(power == 0)){
            p*=numb;
            power--;
        }
        return p;
    }

    static boolean isBlackOrWhite(int x1, int y1, int x2, int y2){

        return ((((x1+y1)%2) == 0) == (((x2+y2)%2) == 0));

    }

}
