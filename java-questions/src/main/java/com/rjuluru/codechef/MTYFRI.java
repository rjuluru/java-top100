package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class MTYFRI
{
	static FastReader sc = null;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		sc = new FastReader();
		int t = sc.nextInt();
		while (t-- > 0) {
			int numOfElements = sc.nextInt();
			int numOfSwaps = sc.nextInt();

			int numOfMotu = numOfElements / 2 + numOfElements % 2;
			int numOfTomu = numOfElements / 2;
			int[] motuElements = new int[numOfMotu];
			int[] tomuElements = new int[numOfTomu];
			for (int i = 0; i<numOfElements/2; i++) {
				motuElements[i] = sc.nextInt();
				tomuElements[i] = sc.nextInt();
			}
			if(numOfElements % 2 == 1) {
				motuElements[numOfMotu - 1] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(motuElements));
//			System.out.println(Arrays.toString(tomuElements));

			reverseSort(motuElements);
			ruffleSort(tomuElements);
//			System.out.println(Arrays.toString(motuElements));

			int minMotuCount = 0;
			int maxTomuCount = 0;
			for (int i = 0; i < tomuElements.length; i++) {
				if(numOfSwaps-- > 0 && motuElements[i] > tomuElements[i]) {
					minMotuCount += tomuElements[i];
					maxTomuCount += motuElements[i];
				}
				else {
					minMotuCount += motuElements[i];
					maxTomuCount += tomuElements[i];
				}
			}
			if(numOfElements % 2 == 1) {
				minMotuCount += motuElements[motuElements.length - 1];
			}
			System.out.println(maxTomuCount > minMotuCount ? "YES" : "NO");
		}
	}

	static int minLen(int low, int high) {
		if(low + 1 == high) {
			return 0;
		}
		int mid = (low + high) / 2;

		return high - low + minLen(low, mid) + minLen(mid, high);
	}



	static int[] reverseSort(int a[]) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i:a)al.add(i);
		Collections.sort(al,Collections.reverseOrder());
		for(int i=0;i<a.length;i++)a[i]=al.get(i);
		return a;
	}
	static void reverse(int a[]) {
		int n=a.length;
		int b[]=new int[n];
		for(int i=0;i<n;i++)b[i]=a[n-1-i];
		for(int i=0;i<n;i++)a[i]=b[i];
	}

	static int[] ruffleSort(int a[]) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i:a)al.add(i);
		Collections.sort(al);
		for(int i=0;i<a.length;i++)a[i]=al.get(i);
		return a;
	}

	static int gcd(int a,int b) {
		if(b==0)return a;
		else return gcd(b,a%b);
	}

	static void print(int a[]) {
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	static void print(long a[]) {
		for(long e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}


	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
		int[] readArray(int n) {
			int a[]=new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			return a;
		}
	}
}
