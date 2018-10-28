https://practice.geeksforgeeks.org/problems/closest-palindrome/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int closestPalindrome(int num) {
        
        // < 10 palindrome by itself
        if(num < 10) {
            return num;
        }
        
        // reverse the left half and add to right
        int tempNum = num;
        int pal = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(tempNum > 0) {
            int rem = tempNum % 10;
            tempNum = tempNum / 10;
            arr.add(rem);
        }
        
        int numLength = arr.size();
        int halfLength = (int) Math.ceil((numLength - 1) /2);
        
        for(int i=0; i< numLength; i++ ) {
            if(i <= halfLength) {
                pal = pal*10 + arr.get(numLength - 1 - i);
            } else {
                pal = pal*10 + arr.get(i);
            }
        }
        
        // check if pal < num;
        if(pal <= num) {
            // return if true
            return pal;
        } else {
            // check if num - diff is palindrome; if yes, return that else return pal
            int diff = pal - num;
            int checkVal = num - diff;
            int checkTemp = checkVal;
            int checkPal = 0;
            
            while(checkTemp > 0) {
                int checkRem = checkTemp % 10;
                checkTemp = checkTemp / 10;
                checkPal = checkPal * 10 + checkRem;
            }
            
            if(checkPal == checkVal) {
                return checkVal;
            } else {
                return pal;
            }
        }
        
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int out[] = new int[n];
		
		for(int i=0; i<n; i++) {
		    out[i] = closestPalindrome(sc.nextInt());
		}
		
		for(int i=0; i<n; i++) {
		    System.out.println(out[i]);
		}
		
	}
}
