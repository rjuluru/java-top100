package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class PCJ18B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = 0;
			while (n>0) {
				sum += n * n;
				n -= 2;
			}
			System.out.println(sum);
		}
	}
}
