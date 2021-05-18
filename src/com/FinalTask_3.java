package com;

import java.util.Scanner;

public class FinalTask_3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = Integer.parseInt(vvod.nextLine());
        Integer[] countUniqueChar = new Integer[n];
        String[] arrayOfStrings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + i + ":");
            arrayOfStrings[i] = vvod.nextLine();
            countUniqueChar[i] = countUniqChar(arrayOfStrings[i]);
        }
        int indexmax = 0;
        int max = countUniqueChar[0];
        for (int i = 1; i < countUniqueChar.length; i++) {
            if (countUniqueChar[i] == max) {
                indexmax = 0;
                max = countUniqueChar[0];
                break;
            }
            if (countUniqueChar[i] > max) {
                indexmax = i;
                max = countUniqueChar[i];
            }

        }
        System.out.println("Строка с максимальным количеством различных символов: " + arrayOfStrings[indexmax]);
    }

    public static int countUniqChar(String str) {
        StringBuilder notDuplicate = new StringBuilder(str.length());
        Character item;
        for (int i = 0; i < str.length(); i++) {
            item = str.charAt(i);
            if (i == 0) {
                notDuplicate.append(item);
            } else if (!notDuplicate.toString().contains(item.toString())) {
                notDuplicate.append(item);
            }
        }
        return notDuplicate.length();
    }
}






