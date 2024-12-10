import java.io.*;

import java.util.* ;
 

import java.util.*;

public class Solution {
	public static ArrayList<Integer> getAllDivisors(int n){
		// Write your code here.
    ArrayList <Integer> result = new ArrayList<>(); 
		for(int i =1;i*i<=n;i++){
			if(n%i==0){
				result.add(i);
				if (i != n / i) {
					result.add(n / i);
				}

			}
		}
    Collections.sort(result);
		return result;
	}
}
