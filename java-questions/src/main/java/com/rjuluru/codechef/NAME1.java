package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class NAME1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Map<Character, Integer> freqMap = new HashMap<>();
			String parents = sc.next() + sc.next();
			for(char ch : parents.toCharArray()) {
				freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
			}

			int n = sc.nextInt();
			boolean valid = true;
			while (n-- > 0) {
				String children = sc.next();
				if(valid) {
					for (char childCh : children.toCharArray()) {
						if(freqMap.getOrDefault(childCh, 0) > 0) {
							freqMap.put(childCh, freqMap.get(childCh) - 1);
						}
						else {
							valid = false;
						}
					}
				}
			}

			System.out.println(valid ? "YES" : "NO");
		}
	}
}
