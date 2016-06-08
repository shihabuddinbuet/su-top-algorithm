package com.su.algo.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		int []arr = new int[numOfInput];
		for(int i = 0; i<numOfInput; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numOfInput; i++){
			int minValue = arr[i];
			int minValueIndex = i;
			for(int j = i; j < numOfInput; j++){
				if(minValue > arr[j]){
					minValue = arr[j];
					minValueIndex = j;
				}
			}
			 // do swap with for min value
			int temp = arr[i];
			arr[i] = minValue;
			arr[minValueIndex] = temp;
		}
		
		for(int i = 0; i < numOfInput; i++){
			System.out.println(arr[i]);
		}
	}

}
