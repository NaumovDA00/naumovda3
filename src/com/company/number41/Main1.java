package com.company.number41;
import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
    public static void main(String[] args) {
        // 4.1 Среднее арифимитическое данных массива
        Scanner sc = new Scanner(System.in);
        System.out.println("4.1");
        System.out.print("Введите размерность массива ");
        int n = sc.nextInt();
        int summ = 0;
        int ar = 0;
        int[] a = new int[n];
        System.out.println(" ");
        System.out.println("Введите массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            summ = summ + a[i];
        }
        ar = summ / n;
        System.out.print("Среднее арифмитическое: ");
        System.out.println(ar);
    }
}
