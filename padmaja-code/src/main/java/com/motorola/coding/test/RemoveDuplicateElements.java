package com.motorola.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {
	
	
  public static String[] removeduplicates(List<?> input) {
	Set<?> removeSet=new LinkedHashSet(input);
	List<?> outPut=new ArrayList(removeSet);
	System.out.println(outPut);
	  //testing the git pull
	return null;
	}
	
	
	public static void main(String args[]) {
		Integer arr[] = {1,10,2,2,10,3,3,3,4,5,5};  
		List<Integer> listofInteger=Arrays.asList(arr);
		String strArray[] = {"G","e","e","k","s"}; 
		List<String> listofString=Arrays.asList(strArray);
		//removing the duplicates from int
		removeduplicates(listofInteger);
		//removing the duplicates from String
		removeduplicates(listofString);
		
	}
	
	

}

