package com.ciq.Demo;

public class Calculation {

	public static int findmix( int arr[]) {
		
		int mix=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(mix<arr[i]) {
				mix=arr[i];
			}
			
		}
		
		return mix;
		
	}
	
}
