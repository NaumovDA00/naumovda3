package com.company.number62;

public class Main12 {
    public static void main(String[] args) {
        //6.2. Возведение чисел в степень.
        int a = 5;
        int b = 3;
        double z = st(a,b);
        System.out.print(z);
    }
    public static double st(int x, int y) {
        double z = Math.pow(x,y);
        return z;
    }
}
