package com;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        double[] a;
        int p;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число элементов массива:");
        p = in.nextInt();
        a = new double[p];
        for (int i = 0; i < p; i++) {
            System.out.println("Введите а[" + i + "]=");
            a[i] = in.nextDouble();
        }
        double sum = 0;
        for (double el : a) {
            sum += el;
        }
        double count=sum / p;
        System.out.println("Среднее арифметическое:" + count);
        System.out.println("Умножаем элементы массива на среднее арифметическое:");
        for (double umn : a) {
            System.out.println(umn*count);
        }
    }
}