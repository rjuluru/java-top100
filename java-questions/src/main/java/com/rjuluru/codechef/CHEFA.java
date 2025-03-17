package com.rjuluru.codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CHEFA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            // your code goes here
            reverseSort(a);
            long max = 0;
            for(int i = 0; i<n ; i = i + 2) {
                max += a[i];
            }
            System.out.println(max);
        }
    }


    static long[] reverseSort(long a[]) {
        ArrayList<Long> al=new ArrayList<>();
        for(long i:a)al.add(i);
        Collections.sort(al,Collections.reverseOrder());
        for(int i=0;i<a.length;i++)a[i]=al.get(i);
        return a;
    }
}
