package com;

import java.util.Scanner;

public class FinalTask_1 {
    public static void main(String[] args) {
        double course, value, result;
        Scanner number = new Scanner(System.in);
        System.out.println("Введите курс доллара к рублю:");
        course = number.nextDouble();
        System.out.println("Введите количество рублей:");
        value = number.nextDouble();
        result = value / course;
        //Double result = Double.format("%.3f",value);
        System.out.print("Итого в $: ");
        System.out.printf("%.2f", result);

    }
}
