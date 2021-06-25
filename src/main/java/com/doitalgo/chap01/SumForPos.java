package com.doitalgo.chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do { // 일단 한번 실행 한 후 반복할 것인지 판단, 사후 판단 반복문 do {} while
            System.out.print("n의 값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
