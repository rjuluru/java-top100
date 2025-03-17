package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class SLAB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[][] slab = {
				{0, 250_000},
				{250_000, 500_000},
				{500_000, 750_000},
				{750_000, 1_000_000},
				{1_000_000, 1_250_000},
				{1_250_000, 1_500_000},
				{1_500_000, Integer.MAX_VALUE}
		};
		double[] rate = { 0, 0.05, 0.1, 0.15, 0.20, 0.25, 0.30};
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int tax = 0;
			for (int i = 0; i < rate.length; i++) {
				if(n > slab[i][1]) {
					tax += (slab[i][1] - slab[i][0]) * rate[i];
				} else {
					tax += (n - slab[i][0]) * rate[i];
					break;
				}
			}
			System.out.println(n - tax);
		}
	}
}
