package com;
import java.util.Scanner;
public class HomeWork_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 'I like Java!!!' ");
        String str = input.nextLine();
        boolean result_1,result_2,result_3;
        //Проверим, содержит ли строка подстроку “Java”
        result_1=str.contains("Java");
        System.out.println(result_1);
        //Проверим, начинается ли строка с подстроки “I like”
        result_2=str.startsWith("I like");
        System.out.println(result_2);
        //Проверим, заканчивается ли строка с подставки “!!!”
        result_3=str.endsWith("!!!");
        System.out.println(result_3);
        //Если 3 предыдущих условия верны, выведем исходную строку в верхнем регистре.
if (result_1&&result_2&&result_3==true) {
        System.out.println(str.toUpperCase());
        }
else System.out.println("Вы что-то не то ввели...");
        //Заменим все символы ‘a’ на ‘о’ и выведем подстроку “Jovo” на экран
        String result_5;
        result_5 = str.replace("a",  "o");
        System.out.println(result_5.substring(7,11));
    }
}
