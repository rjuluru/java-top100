package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class BSHORT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String binary = sc.next();
			int numOfOne = 0;
			for (int i = 0; i < binary.length(); i ++) {
				if(binary.charAt(i) == '1') {
					numOfOne++;
				}
			}

//			for (char i : binary.toCharArray()) {
//				if(i == '1') {
//					numOfOne++;
//				}
//			}

			if(numOfOne == 0) {
				System.out.println(n);
			} else if (numOfOne % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}
}
