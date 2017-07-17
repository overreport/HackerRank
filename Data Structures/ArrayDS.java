//Written by - Seth Savage
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int nREV = n-1;
        int[] ar = new int[n];
        int[] arREV = new int[n];
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();  
            }
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            arREV[ar_i] = ar[nREV];
            nREV--;
            System.out.print(arREV[ar_i] + " ");
            }
        
    }
}