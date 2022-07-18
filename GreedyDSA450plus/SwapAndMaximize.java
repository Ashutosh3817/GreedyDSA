package GreedyDSA450plus;

import java.util.Arrays;

public class SwapAndMaximize {
	public static long maxSum(long[] arr,int n) {
		Arrays.sort(arr);
		int i=0 , j=n-1;
		long sum = 0 ; 
		int ptr = 0 ; 
		while(i<j) {
			sum += arr[j] - arr[i];
			if(ptr==0) {
				ptr++;
				i++;
			}
			else {
				ptr--;
				j--;
				
			}
		}
		sum += arr[n/2] - arr[0];
		return sum;
	}
	public static void main(String[] args) {
		long[] arr = {1,4,8,2};
		int n = arr.length;
		System.out.println(maxSum(arr,n));
	}
}
