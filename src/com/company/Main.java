package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите шаг функции (целое положительное число) -");
            int h = sc.nextInt();
            if (h<0) {
                System.out.println("Число не положительное");
                return;
            }

            System.out.println("Введите начальную координату функции a (целое число) -");
            int a = sc.nextInt();

            System.out.println("Введите начальную координату функции b (целое число) -");
            int b = sc.nextInt();
            sc.close();

            if (b < a) {
                System.out.println("b не может быть меньше a");
                return;
            }

            int n = (b-a)/h;
            System.out.println(n);
            double[] f = new double[n];
            int i;
            double x = (double) a;

            for (i = 0; i < n; i++) {
                f[i] = Math.tan((2*x))-3;
                System.out.printf("Значение функции %f Аргумент %.0f%n", f[i], x);
                x += (double) h;

                  }
        }
        catch (InputMismatchException e) {
            System.out.println("Введено не корректное число");
            }
        }
    }

