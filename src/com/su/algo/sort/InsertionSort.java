package com.su.algo.sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		int []arr = new int[numOfInput];
		for(int i = 0; i<numOfInput; i++){
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 1; i < numOfInput; i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for(int i = 0; i < numOfInput; i++){
			System.out.println(arr[i]);
		}
	}

}
