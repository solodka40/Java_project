package com;
import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x, y, z, result;
        System.out.println("Введите первое число:");
        x = num.nextFloat();
        System.out.println("Введите второе число:");
        y = num.nextFloat();
        System.out.println("Введите третье число:");
        z = num.nextFloat();
        result = (x + y + z)/3;
        System.out.println("Среднее арифметическое равно:"+result);
        float next;
        next=result/2;
        System.out.println("Разделим это число на 2 и округлим его в меньшую сторону, получим:"+Math.floor(next));
        if (next>3)
            System.out.println("Программа выполнена корректно.");
    }
}