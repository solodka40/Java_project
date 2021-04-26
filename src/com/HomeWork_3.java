package com;
public class HomeWork_3 {
    public static void main(String[] args) {
            //создаем массив из пяти целых чисел
            int[] ref = new int[5];
            ref [0]=1;
            ref [1]=2;
            ref [2]=3;
            ref [3]=4;
            ref[4]=5;
            //меняем местами первый и последний элементы массива
            int a=ref [0];
            ref[0]=ref[ref.length-1];
            ref[ref.length-1]=a;
            //проверяем, что элементы поменялись.
            System.out.println(ref[0]);
            System.out.println(ref[4]);
            //выводим на консоль результат суммы первого и среднего элемента
            int sm=(ref[0]+ref[(ref.length-1)/2]);
            System.out.println(sm);

        }
}
