package com.su.algo.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter your input in ascending order : ");
		for(int i = 0; i < numOfInput; i++){
			arr.add(sc.nextInt());
		}
		
		int targetNum = sc.nextInt();
		int startIndex = 0, endIndex = numOfInput - 1, midIndex = (startIndex + endIndex)/2;
		
		while (startIndex <= endIndex){
			int midNum = arr.get(midIndex);
			if(midNum == targetNum){
				System.out.print("Found");
				return;
			}
			
			else if( midNum < targetNum ){
				startIndex = midIndex + 1;
			}
			
			else {
				endIndex = midIndex - 1;
			}
			
			midIndex = (startIndex + endIndex)/2;
			
		}
		
		System.out.print("not found");
	}

}
