package com.company.number55;
import java.util.Arrays;
import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        //5.5 Максимальное число массива
        Scanner sc = new Scanner(System.in);
        System.out.println("5.5");
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.print("Введите массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[n - 1]);
    }
}
