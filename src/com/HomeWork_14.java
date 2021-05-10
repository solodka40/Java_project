package com;

import java.util.Random;

public class HomeWork_14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
            System.out.println(array[i]);

        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min is: " + min + " . " + "Max is: " + max);
        int modul_max = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю из min и max:" + modul_max);


    }
}




