package com.rjuluru.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
https://www.codechef.com/problems/AVGPERM
 */
class AVGPERM
{
    static FastReader sc = new FastReader();
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
			for (int i = 1 ; i < n ; i++) {
				if(i <=2 ) {
					System.out.print(n-i + " ");
				}
				else {
					System.out.print(i-2 + " ");
				}
			}
			System.out.println(n);
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
