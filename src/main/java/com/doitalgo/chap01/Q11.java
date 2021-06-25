package com.doitalgo.chap01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int a = stdIn.nextInt();

        int n = (int) (Math.log10(a) + 1); // length는 문자열 길이. 숫자 길이는 (int)(Math.log10(변수명)+1

        System.out.println("그 자리 수는 " + n + " 자리입니다.");
    }
}
