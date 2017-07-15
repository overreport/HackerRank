// Written by Seth Savage
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] ar = new int[n];
        int spaces = (n - 1);
        int steps = 1;
        int[] spaceAR = new int[n];
        int[] stepsAR = new int[n];
        // Fill space and step Arrays
        for(int ar_i = 0; ar_i < n; ar_i++) {
            spaceAR[ar_i] = spaces; 
            spaces = spaces - 1;
            stepsAR[ar_i] = steps; 
            steps = steps + 1;      
        }
        // Print Steps
        for(int ar_i = 0; ar_i < n; ar_i++) {
             for(int ar_space = 0; ar_space < spaceAR[ar_i]; ar_space++) {
                 System.out.print(" ");
             }
            
            for(int ar_step = 0; ar_step < stepsAR[ar_i]; ar_step++) {
                 System.out.print("#");
             }
            System.out.println();
        }  
    }
}