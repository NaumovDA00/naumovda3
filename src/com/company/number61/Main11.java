package com.company.number61;

public class Main11 {
    public static void main(String[] args) {
        //6.1. Сумма квадратов чисел.
        int a = 5;
        int b = 3;
        double z = kv(a,b);
        System.out.print("Сумма квадаратов: ");
        System.out.print(z);
    }
    public static double kv(int x, int y) {
        double z = Math.pow(x,2) + Math.pow(y,2);
        return z;
    }
}
