package com.company.number53;
import java.util.Arrays;
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
//5.3 Сравнение многомерных массивов
        Scanner sc = new Scanner(System.in);
        System.out.println("5.3");
        System.out.print("Введите размерность массива 1:");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        int k1 = sc.nextInt();
        System.out.print("Введите размерность массива 2:");
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();
        int k2 = sc.nextInt();
        int mdarray1[][][] = new int[i1][j1][k1];
        int mdarray2[][][] = new int[i2][j2][k2];
        for (int m = 0; m < i1; m++) {
            for (int n = 0; n < j1; n++) {
                for (int p = 0; p < k1; p++) {
                    mdarray1[m][n][p] = sc.nextInt();
                }
            }
        }
        for (int m = 0; m < i2; m++) {
            for (int n = 0; n < j2; n++) {
                for (int p = 0; p < k2; p++) {
                    mdarray2[m][n][p] = sc.nextInt();
                }
            }
        }
        if (Arrays.deepEquals(mdarray1,mdarray2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        //for (int m = 0; m < i2; m++) {
        //    for (int n = 0; n < j2; n++) {
        //        for (int p = 0; p < k2; p++) {
        //            if (mdarray1 == mdarray2) {
        //                System.out.println("Равны");
        //            } else {
        //                System.out.println("Не равны");
        //                break;
        //            }
        //        }
        //    }
        for (int m = 0; m < i1; m++) {
            for (int n = 0; n < j1; n++) {
                for (int p = 0; p < k1; p++) {
                    System.out.print(mdarray1[m][n][p] + " ");
                }
            }
        }
        System.out.println(" ");
        for (int m = 0; m < i2; m++) {
            for (int n = 0; n < j2; n++) {
                for (int p = 0; p < k2; p++) {
                    System.out.print(mdarray2[m][n][p] + " ");
                }
            }
        }
        }
    }

