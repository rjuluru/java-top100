package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class HOTEL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int numOfGuest = sc.nextInt();
			int[] arrival = new int[numOfGuest];
			for (int i=0; i<numOfGuest; i++) {
				arrival[i] = sc.nextInt();
			}

			Map<Integer, Integer> slots = new HashMap<>();
			for (int i = 0; i < numOfGuest; i++) {
				int departure = sc.nextInt();
				for (int j = arrival[i]; j < departure; j++) {
					slots.put(j, slots.getOrDefault(j, 0) + 1);
				}
			}
//			System.out.println(slots.toString());
			System.out.println(Collections.max(slots.values()));
		}
	}
}
