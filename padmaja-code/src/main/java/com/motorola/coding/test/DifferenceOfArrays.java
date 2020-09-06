package com.motorola.coding.test;

import java.util.Arrays;

public class DifferenceOfArrays {
	
	
	public static void main(String[] args) {
		int[] array1= {1,3,15,11,2};
		int[] array2= {23,127,235,19,8};
		smallestDifference(array1,array2,array1.length,array2.length);
		
	}
	
    public  static  void smallestDifference(int A[], int B[], 
                                      int m, int n) 
	{
		Arrays.sort(A);
		Arrays.sort(B);
		int a = 0, b = 0;
		int f=0,s=0;
		int result = Integer.MAX_VALUE;
		while (a < m && b < n) {
			if (Math.abs(A[a] - B[b]) < result) {
				result = Math.abs(A[a] - B[b]);
				f=A[a];
				s=B[b];
			}
			if (A[a] < B[b])
				a++;
			else
				b++;
		}
		System.out.println("Smallest Difference:"+result);
		System.out.println("Pair:"+"("+f+","+s+")");
		
	} 
	
	
}
