package com.company.number64;
import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        //6.4. Удаление нечетных чисел из массива.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Введите массив: ");
        for (int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        nech(a,n);
    }
    public static void nech(int [] x, int m) {
        int u = 0;
        for (int i = 0; i < m;i++){
            if (x[i] % 2 == 0) {
                u = u + 1;
            }
        }
        int[] b = new int[u];
        u = 0;
        for (int i = 0; i < m;i++){
            if (x[i] % 2 == 0) {
                b[u] = x[i];
                u = u + 1;
            }
        }
        for (int i = 0; i < u ;i++){
            System.out.print(b[i] + " ");
        }
    }
}
