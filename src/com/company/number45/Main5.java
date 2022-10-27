package com.company.number45;
import java.util.Scanner;
import java.util.Arrays;
public class Main5 {
    public static void main(String[] args) {
        //4.5 Вывод матрицы с помощью двумерного массива.
        Scanner sc = new Scanner(System.in);
        System.out.println("4.5");
        System.out.print("Введите размерность двумерного массива: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 1;
        int[][] a = new int[m][n];
        for (int i = 0; i < m;i++) {
            for (int j = 0; j < n;j++) {
                a[i][j] = s;
                s = s + 1;
            }
        }
        for (int i = 0; i < m;i++) {
            for (int j = 0; j < n;j++) {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }
}
