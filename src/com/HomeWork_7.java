package com;
import java.util.Scanner;
public class HomeWork_7 {
    public static void main(String[] args) {
        //System.out.print("\n");
        int [] a;
        int n;
        int [] con=new int [] {5,6,7};
Scanner in=new Scanner(System.in);
        System.out.println("Введите число элементов массива:");
        n=in.nextInt();
        a=new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("Введите а["+i+"]=");
            a[i]=in.nextInt();
            for (int j=0;j<3;j++) {
                if (con[j]==a[i]) {
                    System.out.println("Данное значение имеется в константах");
                }
            }



        }
    }
}
