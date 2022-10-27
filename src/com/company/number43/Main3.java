package com.company.number43;
import java.util.Scanner;
import java.util.Arrays;
public class Main3 {
    public static void main(String[] args) {
        //4.3 Сумма отрицательных элементов массива.
        Scanner sc = new Scanner(System.in);
        System.out.println("4.3");
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();
        int summ = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                summ = summ + a[i];
            }
        }
        System.out.print("Сумма: ");
        System.out.println(summ);
    }
}
