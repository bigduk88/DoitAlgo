package com.doitalgo.chap01;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a;
        System.out.println("사각형을 출력합니다.");

        do {
            System.out.print("단수: ");
             a = stdIn.nextInt();
        } while (a <= 0);

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
