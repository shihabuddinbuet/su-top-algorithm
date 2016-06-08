package com.su.algo.sort;

import java.util.Scanner;

public class SelectionSortedRecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		int []arr = new int[numOfInput];
		for(int i = 0; i<numOfInput; i++){
			arr[i] = sc.nextInt();
		}
		
		int []sortedElements = getSelectionSortedElements(arr, 0, 0);
	}

	private static int [] getSelectionSortedElements(int [] arr, int i , int j ){
		
		if( j == arr.length-1 ){
			//return min
		}
		
		else if (i == arr.length - 1){
			return arr;
		}
		
//		else {
//			getSelectionSortedElements
//		}
		return null;
	}
}
