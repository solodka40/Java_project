package com;
import java.util.Scanner;
public class HomeWork_11 {
    public static void main(String[] args) {
        //вводим первое число
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float num = input.nextFloat();
        //записываем его в строковую переменную
        String result;
        result = Double.toString(num);
        //вводим второе число
        System.out.println("Введите второе число: ");
        float num_1 = input.nextFloat();
        //записываем его в целочисленную переменную типа int
        int result_1 = (int) num_1;
        //находим максимальное и выводим на экран
        float task3 = Math.max (num,num_1);
        System.out.println("Максимальное число:"+task3);
        //находим минимальное, переводим в double и выводим на экран
        double task4 = Math.min(num,num_1);
        System.out.println("Минимальное число в double:"+task4);
    }
}
