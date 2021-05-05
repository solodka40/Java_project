package com;
import java.util.Scanner;
public class HomeWork8 {
    public static void main(String[] args) {
        int an,k;
        Scanner q = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        an = q.nextInt();
        int sum=0;
        for (int c=1;c<an;c++) {
            if (c % 2 == 0)
                continue;
            sum = sum + c;
            c += 1;

        }
        System.out.println("Сумма всех нечетных чисел от 1 до введенного Вами числа равна:"+sum);
        }
    }
