import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[][] ar = new int[n][n];
        
        // Loop - Creates Matrix
        for(int ar_row = 0; ar_row < n; ar_row++){
            for(int ar_col = 0; ar_col < n; ar_col++){
            ar[ar_row][ar_col] = in.nextInt();  
            }
        }
        
        int pStart = 0;
        int sStart = n-1;
        int pSum = 0;
        int sSum = 0;
        
        // Loop - Calculates Primary Diagonal Sum
        for(int ar_row = 0; ar_row < n; ar_row++) {
            pSum = ((ar[ar_row][pStart]) + pSum);
            pStart++;
        }
        
         // Loop - Calculates Secondary Diagonal Sum
        for(int ar_row = 0; ar_row < n; ar_row++) {
            sSum = ((ar[ar_row][sStart]) + sSum);
            sStart--;
        }
        
        // Calculate Absolute Value Diff
        System.out.println(Math.abs(pSum - sSum));
        
        
        
    }
    
}