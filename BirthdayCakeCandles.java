//Written by - Seth Savage
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int heightest = 0;
        int freQ = 0;
        
        
        for(int i=0; i < n; i++){
            int hGt = in.nextInt();
            
            if(hGt > heightest){
                heightest = hGt;
                freQ = 1;
            }
            else if(hGt == heightest) freQ++;
        }
        System.out.println(freQ);
    }
}