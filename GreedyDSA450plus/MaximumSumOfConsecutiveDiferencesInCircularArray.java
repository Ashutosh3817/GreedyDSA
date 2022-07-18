package GreedyDSA450plus;

import java.util.Arrays;

public class MaximumSumOfConsecutiveDiferencesInCircularArray {
	public static long maxSum(int[] arr,int n) {
		Arrays.sort(arr);
		int i = 0 ,j=n-1;
		long sum = 0 ; 
		int ptr = 0 ; 
		while(i<j) {
			sum += arr[j]-arr[i];
			if(ptr==0) {
				i++;
				ptr++;
			}
			else {
				j--;
				ptr--;
			}
		}
		sum += arr[n/2]-arr[0];
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {4,2,1,8};
		int n =arr.length;
		System.out.println(maxSum(arr,n));
	}
}
