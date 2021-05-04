package com;
import java.util.Scanner;
public class HomeWork_6 {
    public static void main(String[] args) {
        int m_1, massa, dlina;
        float kolvo;
        Scanner number = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        m_1 = number.nextInt();
        if (m_1 == 1) {
            System.out.println("Выберите единицу измерения: 1-грамм, 2-килограмм, 3-унция, 4-фунт");
            massa = number.nextInt();
            switch (massa) {
                case 1:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Граммы:"+ kolvo);
                    System.out.println("Килограммы:"+kolvo / 1000);
                    System.out.println("Унции:"+kolvo / 28.35);
                    System.out.println("Фунты:"+kolvo / 454);
                    break;
                case 2:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Граммы:"+ kolvo*1000);
                    System.out.println("Килограммы:"+kolvo);
                    System.out.println("Унции:"+kolvo*35.274);
                    System.out.println("Фунты:"+kolvo *2/205);
                    break;
                case 3:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Граммы:"+ kolvo* 28.35);
                    System.out.println("Килограммы:"+kolvo / 35.274);
                    System.out.println("Унции:"+kolvo);
                    System.out.println("Фунты:"+ kolvo / 16);
                    break;
                case 4:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Граммы:"+ kolvo * 454);
                    System.out.println("Килограммы:"+ kolvo / 2.205);
                    System.out.println("Унции:"+ kolvo * 16);
                    System.out.println("Фунты:"+ kolvo);
                    break;
                default:
                    System.out.println("Ошибка. Вы ввели неверное число");
            }
        } else if (m_1 == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            dlina = number.nextInt();
            switch (dlina) {
                case 1:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Метры:"+ kolvo);
                    System.out.println("Мили:"+ kolvo / 1609);
                    System.out.println("Ярды:"+ kolvo * 1.094);
                    System.out.println("Футы:"+ kolvo * 3.281);
                    break;
                case 2:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Метры:"+ kolvo * 1609);
                    System.out.println("Мили:"+ kolvo);
                    System.out.println("Ярды:"+ kolvo * 1760);
                    System.out.println("Футы:"+ kolvo * 5280);
                    break;
                case 3:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Метры:"+ kolvo / 1.094);
                    System.out.println("Мили:"+ kolvo / 1760);
                    System.out.println("Ярды:"+ kolvo);
                    System.out.println("Футы:"+ kolvo * 3);
                    break;
                case 4:
                    System.out.println("Введите число");
                    kolvo = number.nextFloat();
                    System.out.println("Результат:");
                    System.out.println("Метры:"+ kolvo / 3.281);
                    System.out.println("Мили:"+ kolvo / 5280);
                    System.out.println("Ярды:"+ kolvo / 3);
                    System.out.println("Футы:"+ kolvo);
                    break;
                default:
                    System.out.println("Ошибка. Вы ввели неверное число");
            }
        } else {
            System.out.println("Ошибочка");
        }
    }

}