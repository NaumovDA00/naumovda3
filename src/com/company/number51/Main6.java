package com.company.number51;
import java.util.Arrays;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
    //5.1 Сортировка массива из целых чисел
        Scanner sc = new Scanner(System.in);
        System.out.println("5.1");
        System.out.print("Введите размерность массива:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Введите массив: ");
        for( int i = 0;  i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for( int i = 0;  i<n;i++)  {
            System.out.print(a[i] + " ");
        }
}
}
