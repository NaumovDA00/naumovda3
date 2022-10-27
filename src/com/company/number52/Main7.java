package com.company.number52;
import java.util.Arrays;
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        //5.2 Сортировка массива из букв
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива:");
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.print("Введите массив из букв:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
