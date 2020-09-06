package com.motorola.coding.test;

public class RepeatCharacters {
	
	
	public static void main(String args[]) {
		
		countOfDuplicates("aabccccccaaa");
		countOfDuplicates("abc");
	}
	
	public static void countOfDuplicates(String input) {
		
		StringBuffer sb=new StringBuffer();
		char[] array=input.toCharArray();
		for(int i=0;i<array.length;i++) {
			int count=1;
			sb.append(array[i]);
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count=count+1;
					i++;
				}else {
					break;
				}
				
			}
			sb.append(count);
		}
		
	System.out.println(sb.toString());
	}
}
