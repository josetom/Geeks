// https://practice.geeksforgeeks.org/problems/common-subsequence/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int commonSubsequence(char[] a, char[] b) {
        int csArray[][] = new int[a.length+1][b.length+1];
        for(int i=0; i<=a.length; i++) {
            for(int j=0; j<=b.length; j++) {
                if(i==0 || j==0) {
                    csArray[i][j] = 0;
                } else if (a[i-1] == b[j-1]) {
                    csArray[i][j] = csArray[i-1][j-1] + 1;
                } else {
                    csArray[i][j] = Math.max(csArray[i][j-1], csArray[i-1][j]);
                }
            }
        }
        
        // for(int i=0; i<a.length+1; i++) {
        //     System.out.println(Arrays.toString(csArray[i]));
        // }
        // return csArray[a.length][b.length];
	    
        // int index = csArray[a.length][b.length];
        // char subSeq[] = new char[index];
        // int i = a.length;
        // int j = b.length;
        // while(i > 0 && j > 0) {
        //     if(a[i-1] == b[j-1]) {
        //         subSeq[index-1] = a[i-1];
        //         i--;
        //         j--;
        //         index--;
        //     } else {
        //         if(csArray[i-1][j] > csArray[i][j-1]) {
        //             i--;
        //         } else {
        //             j--;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(subSeq));
        
        
        return (csArray[a.length][b.length] >= 1) ? 1 : 0;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
		    String a = sc.next();
		    String b = sc.next();
		    System.out.println(commonSubsequence(a.toCharArray(), b.toCharArray()));
		}
		
	}
}
