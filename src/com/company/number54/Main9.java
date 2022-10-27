package com.company.number54;
import java.util.Arrays;
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        //5.4 Заполнение массива числом
        Scanner sc = new Scanner(System.in);
        System.out.println("5.4");
        System.out.print("Введите число: ");
        int ch = sc.nextInt();
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ch;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
