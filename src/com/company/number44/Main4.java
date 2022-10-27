package com.company.number44;
import java.util.Scanner;
import java.util.Arrays;
public class Main4 {
    public static void main(String[] args) {
        //4.4 Сумма с нарастающим итогом
        Scanner sc = new Scanner(System.in);
        System.out.println("4.4");
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();
        int s = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n;i++) {
            a[i] = sc.nextInt();
            s = s + a[i];
            b[i] = s;
        }
        for (int i = 0; i < n;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < n;i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
    }
}
