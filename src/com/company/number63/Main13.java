package com.company.number63;

public class Main13 {
    public static void main(String[] args) {
        //6.3. Проверка четности чисел.
        int a = 6;
        st(a);
    }
    public static void st(int x) {
        if (x % 2 == 0) {
            System.out.print("Число четное");
        } else {
            System.out.print("Число нечетное");
        }

    }
}
