package com.hackerrank.daysofcode;

import java.util.Scanner;

/**
 * Created by Jurel on 5/19/2016.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.printf("%d ", arr[i]);
        }
        in.close();
    }
}
