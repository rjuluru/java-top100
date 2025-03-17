package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class ALTARAY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean[] arr = new boolean[n];
			for (int i =0; i<n; i++) {
				arr[i] = sc.nextInt() > 0;
			}
			for (int i =0; i<n; i++) {
				int count = 1;
				boolean last = arr[i];

				for (int j = i + 1; j < n ; j++) {
					if(arr[j] != last) {
						count++;
						last = arr[j];
					}
					else {
						break;
					}
				}
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
}
