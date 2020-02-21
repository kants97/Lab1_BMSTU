package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        n = in.nextInt();

        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = in.next();
        }

        for (int i=0; i<n; i++) {
            System.out.print(str[i]);
        }

        System.out.println();

        for (int i=0; i<n; i++) {
            System.out.println(str[i]);
        }

    }
}
