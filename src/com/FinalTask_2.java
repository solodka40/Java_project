package com;

import java.util.Scanner;

public class FinalTask_2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите уравнение с x и числами от 0 до 9:");
        String uravnenie = vvod.nextLine();
        char[] arrayofsimb = uravnenie.toCharArray();

        if (arrayofsimb[1] == '-') {
            if (arrayofsimb[0] == 'x') {
                int y = (Character.getNumericValue(arrayofsimb[2])) + (Character.getNumericValue(arrayofsimb[4]));
                System.out.println("Ответ:" + y);
            } else if (arrayofsimb[2] == 'x') {
                int y = (Character.getNumericValue(arrayofsimb[0])) - (Character.getNumericValue(arrayofsimb[4]));
                System.out.println("Ответ:" + y);
            } else {
                int y = (Character.getNumericValue(arrayofsimb[0])) - (Character.getNumericValue(arrayofsimb[2]));
                System.out.println("Ответ:" + y);
            }
        } else if (arrayofsimb[1] == '+') {
            System.out.println("Тогда уравнение с плюсом");
            if (arrayofsimb[0] == 'x') {
                int y = (Character.getNumericValue(arrayofsimb[4])) - (Character.getNumericValue(arrayofsimb[2]));
                System.out.println("Ответ:" + y);
            } else if (arrayofsimb[2] == 'x') {
                int y = (Character.getNumericValue(arrayofsimb[4])) - (Character.getNumericValue(arrayofsimb[0]));
                System.out.println("Ответ:" + y);
            } else {
                int y = (Character.getNumericValue(arrayofsimb[0])) + (Character.getNumericValue(arrayofsimb[2]));
                System.out.println("Ответ:" + y);
            }
        } else System.out.println("Неверный ввод");
    }

}

