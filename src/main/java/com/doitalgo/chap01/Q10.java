package com.doitalgo.chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값: ");
        int a = stdIn.nextInt();

        System.out.print("b의 값: ");
        int b = stdIn.nextInt();
        if (a >= b) {
            System.out.print("a보다 큰 값을 입력하세요!");
        } else {
            int min = (b - a);

            System.out.println("b - a는 " + min + " 입니다.");
        }
    }
}