package com.su.algo.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchRecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < numOfInput; i++){
			arr.add(sc.nextInt());
		}
		int targetInput = sc.nextInt();
		boolean found = binarySeach(arr, 0, numOfInput-1, (numOfInput -1)/2, targetInput);
		
		if(found == true)
			System.out.println("found");
		else
			System.out.print("not found");
	}
	
	private static boolean binarySeach(List<Integer> arr, int startIndex, 
			int endIndex, int midIndex, int targetInput)
	{
		int minNum = arr.get(midIndex);
		if(startIndex > endIndex)
			return false;
		else if(minNum == targetInput)
			return true;
		else if (minNum < targetInput)
			return binarySeach(arr, midIndex + 1, endIndex, (midIndex+1 + endIndex)/2, targetInput);
		else
			return binarySeach(arr, startIndex, midIndex-1,(startIndex + midIndex - 1)/2, targetInput);		
		
	}

}
