// Written by - Seth Savage
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long aVar = in.nextLong();
        long bVar = in.nextLong();
        long cVar = in.nextLong();
        long dVar = in.nextLong();
        long eVar = in.nextLong();
        SortedSet<Long> sortedSet = new TreeSet();
        sortedSet.add(bVar + cVar + dVar + eVar);
        sortedSet.add(aVar + cVar + dVar + eVar);
        sortedSet.add(aVar + bVar + dVar + eVar);
        sortedSet.add(aVar + bVar + cVar + eVar);
        sortedSet.add(aVar + bVar + cVar + dVar);
        System.out.println(sortedSet.first()  + " " + sortedSet.last());
    }}