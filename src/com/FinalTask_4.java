package com;

import java.util.Scanner;

public class FinalTask_4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        System.out.println("У Вас есть 3 попытки, чтобы отгадать загадку!");

        int popytka = 0;
        do {
            popytka++;
            System.out.println("Попытка №" + popytka + " :");
            String otvet = vvod.nextLine();

            if (otvet.equalsIgnoreCase("Подсказка")) {
                if (popytka == 1) {
                    System.out.println("Это не лук и не капуста:)");
                    String otvet_1 = vvod.nextLine();
                    if (otvet_1.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                        return;
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                        return;
                    }
                } else {
                    popytka--;
                    System.out.println("Подсказка уже не доступна");
                }
            }
            if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else {
                System.out.println("Подумай еще!");
            }

            if (popytka == 3) {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        while (popytka < 3);
    }

}


