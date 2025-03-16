package com.rjuluru.codechef.CORTSENT;
import java.util.*;
import java.lang.*;
import java.io.*;

/*
https://www.codechef.com/problems/CORTSENT
*/
class Codechef
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //To get the T test cases
        while (t--> 0) {
            // To get the first number to get K words
            int k = sc.nextInt();
            boolean language = true;
            while (k--> 0) {
                // To get the next word
                String word = sc.next();
                if (language) {
                    // Checking for non language characters
                    if (word.matches("[^a-mN-Z]")) {
                        language = false;
                    }
                    // Checking if two language characters got mixed up
                    else if (!word.matches("^([a-m]+|[N-Z]+)$")) {
                        language = false;
                    }
                }
            }

            System.out.println(language? "YES" : "NO");
        }

    }

}
