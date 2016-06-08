package com.su.algo.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		int [] arr = new int[numOfInput];
		
		for(int i = 0; i<numOfInput; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i< numOfInput; i++){
			for(int j = 0; j < numOfInput - 1; j++){
				if( arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i<numOfInput; i++){
			System.out.println(arr[i]);
		}
		
	}

}
