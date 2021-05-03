package com;
import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        float n_1,n_2;
        System.out.println("Введите первое число:");
        n_1=number.nextFloat();
        System.out.println("Введите второе число:");
        n_2=number.nextFloat();
        Scanner ans = new Scanner(System.in);
        String a_3;
        System.out.println("Введите знак математического действия: +,-,/,*");
        a_3=ans.nextLine();

        switch (a_3){
            case "*":System.out.println("Ответ:"+n_1*n_2);
            break;
            case "/":System.out.println("Ответ:"+n_1/n_2);
            break;
            case "+":System.out.println("Ответ:"+(n_1+n_2));
            break;
            case "-":System.out.println("Ответ:"+(n_1-n_2));
            break;
            default:
                System.out.println("Вы ввели неверный знак.");
        }


    }
}
