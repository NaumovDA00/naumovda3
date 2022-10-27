package com.company.number71;
import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        //7.1 Калькулятор
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите оператор: ");
        String c = sc.nextLine();
        if (c.equals("+")) {
            int result = summ(a,b);
            System.out.print(result);
        } else if (c.equals("-")) {
            int vresult = vich(a,b);
            System.out.print(vresult);
        } else if (c.equals("*")) {
            double uresult = umn(a,b);
            System.out.print(uresult);
        } else if (c.equals("/")) {
            if (b == 0 ) {
                System.out.print("Ошибка: деление на ноль");
            } else {
                double dresult = del(a,b);
                System.out.print(dresult);
            }
        } else if (c.equals("^")) {
            if (b < 0 ) {
                System.out.print("Ошибка: возведение в отрицательную степень недоступно");
            } else {
                double stresult = st(a,b);
                System.out.print(stresult);
            }
        }
    }
    public static int summ(int x, int y) {
        return x + y;
    }
    public static int vich(int x, int y) {
        return x - y;
    }
    public static double umn(int x, int y) {
        return x * y;
    }
    public static double del(int x, int y) {
        return x / y;
    }
    public static double st(int x, int y) {
        return Math.pow(x,y);
    }
}
