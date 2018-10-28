https://practice.geeksforgeeks.org/problems/minimum-platforms/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int minimumPlatforms(int n, int[] in, int[] out) {
        int pc = 1;
        int maxPc = 1;
        int i=1, j=0; 
        
        Arrays.sort(in);
        Arrays.sort(out);
        
        while(i < n && j < n) {
            if(in[i] <= out[j]) {
                pc++; i++;
                if(maxPc < pc) {
                    maxPc = pc;
                }
            } else {
                pc--; j++;
            }
        }
        
        return maxPc;
        
    }
    
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCount = sc.nextInt();
		
		for(int tc=0; tc< testCount; tc++) {
		
		    int n = sc.nextInt();
		    int in[] = new int[n];
		    int out[] = new int[n];
		
		    for(int i=0; i<n; i++) {
		        in[i] = sc.nextInt();
		    }
		
		    for(int i=0; i<n; i++) {
		        out[i] = sc.nextInt();
		    }
		    
		    System.out.println(minimumPlatforms(n, in, out));
		
		}
		
	}
}
