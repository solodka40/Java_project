package com;

import java.util.Scanner;

public class HomeWork_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String stroka = input.nextLine();
        String[] wordArray = stroka.split(" ");
        String[] myselection = new String[wordArray.length];
        String allengsimb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = 0;
        for (String select_word : wordArray) {
            boolean proverka = false;
            for (int i = 0; i < select_word.length(); i++) {
                Character mysimb = select_word.charAt(i);
                if (allengsimb.contains(mysimb.toString())) {
                    proverka = true;
                } else {
                    proverka = false;
                    break;
                }
            }
            if (proverka) {
                myselection[index] = select_word;
                index++;
                System.out.println();
            }
        }
        System.out.println("Вот слова, состоящие только из латиницы:");
        for (String lookingformyselection : myselection) {
            if (lookingformyselection != null) {
                System.out.println(lookingformyselection);
            }
        }
        int count = 0;
        for (int i = 0; i < myselection.length; i++) {
            if (myselection[i] != null) {
                count = i + 1;
            }
        }
        System.out.println("Количество слов, состоящих только из латиницы:"+count);
    }
}

