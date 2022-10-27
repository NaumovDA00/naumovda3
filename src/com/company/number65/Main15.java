package com.company.number65;
import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        //6.5. Удаление числа из массива.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Введите число, повторы которого нужно удалить ");
        int k = sc.nextInt();
        for (int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        pov(a,k,n);
    }
    public static void pov(int [] x, int m,int p) {
        int u = 0;
        for (int i = 0; i < p;i++){
            if (!(x[m] == x[i]) | m == i) {
                u = u + 1;
            }
        }
        int[] b = new int[u];
        u = 0;
        for (int i = 0; i < p;i++){
            if (!(x[m] == x[i]) | m == i) {
                b[u] = x[i];
                u = u + 1;
            }
        }
        for (int i = 0; i < u ;i++){
            System.out.print(b[i] + " ");
        }
    }
}
