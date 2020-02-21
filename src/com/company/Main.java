package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, k;
        boolean flag = false;
        int[] array = new int[50];

        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        n = in.nextInt();

        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }

        while (flag == false) {
            flag = true;
            for (int i=0; i<n-1; i++) {
                if (array[i]>array[i+1]){
                    flag = false;
                    k = array[i];
                    array[i] = array[i+1];
                    array[i+1] = k;
                }
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i=n; i>0; i--) {
            System.out.print(array[i-1] + " ");
        }
    }
}
