package com;
import java.util.Scanner;
public class HomeWork10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int size = input.nextInt();
        int array[][] = new int[size][size];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Полученная матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Числа первой строки, умноженные на 3:");
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                    System.out.print(" " + 3*array[i][j] + " ");
            }
            //System.out.println();
            if (i==0) {
                break;
            }
        }

    }
}




