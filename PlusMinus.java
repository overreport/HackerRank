// Written by - Seth Savage
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        double[] ar = new double[n];
        double posAMT = 0;
        double negAMT = 0;
        double zeroAMT = 0;
       
        
        // Loop - Creates Matrix
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt(); 
            if (ar[ar_i] > 0)
                posAMT = posAMT + 1;
            else if (ar[ar_i] < 0)
                negAMT = negAMT + 1;
            else if (ar[ar_i] == 0)
                zeroAMT = zeroAMT + 1;
        }
        
        double posRST = posAMT/n;
        double negRST = negAMT/n;
        double zeroRST = zeroAMT/n;
         // Print
        System.out.println(posRST);
        System.out.println(negRST);
        System.out.println(zeroRST);
        
        
    }
}