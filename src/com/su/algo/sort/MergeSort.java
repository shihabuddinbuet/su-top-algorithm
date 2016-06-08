package com.su.algo.sort;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		int []arr = new int[numOfInput];
		
		for(int i=0; i<numOfInput; i++){
			arr[i] = sc.nextInt();
		}
		
		mergerSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < numOfInput; i++){
			System.out.println(arr[i]);
		}
	}
	
	private static void mergerSort(int[] arr, int l, int r){
		if(r > l){
			int m = l+(r-l)/2;
			mergerSort(arr, l, m);
			mergerSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
		
	}
	
	private static void merge(int []arr, int l, int m, int r){
		int n1 = m-l + 1;
		int n2 = r - m;
		int [] leftArray = new int[n1];
		int [] rightArray = new int[n2];
		for(int i = 0; i < n1; i++){
			leftArray[i] = arr[i];
		}
		
		for(int j = 0; j < n2; j++){
			rightArray[j] = arr[m + 1 +j];
		}
//		 R[j] = arr[m + 1+ j];
		int i = 0, j = 0, k = l;
		while(i < n1 && j < n2 ){
			if(leftArray[i] < rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}
			
			else {
				arr[k] = rightArray[j];
				j++;
			}
			
			k++;
		}
		
		while(i < n1){
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		
		while(j < n2){
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
}
