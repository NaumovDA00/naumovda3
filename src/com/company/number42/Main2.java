package com.company.number42;
import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        //4.2. Максимальное из N чисел.
        Scanner sc = new Scanner(System.in);
        System.out.println("4.2");
        System.out.print("Введите размерность массива ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Введите массив: ");
        for (int i = 0; i < n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Максимальное число:" + " ");
        System.out.println(a[n - 1]);
    }
}
