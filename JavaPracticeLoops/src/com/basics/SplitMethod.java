package com.basics;

public class SplitMethod {
	
public static void main(String[] args) {
		
		String s = "attention seeker";
		
		String[] arr = s.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = arr[i].length() - 1; j >= 0; j--) {
				
				System.out.println(arr[i].charAt(j));
				
			}
			
			System.out.println();
			
		}
		
	}

}