package GreedyDSA450plus;

import java.util.Arrays;

public class SmallestSubsetWithSumGreaterThanGivenValue {
	public static int subset(int[] arr,int n) {
		int halfsum=0;
		for(int i=0;i<n;i++) {
			halfsum += arr[i];
		}
		halfsum = halfsum/2;
		Arrays.sort(arr);
		int res = 0 ;
		int sumres=0;
		for(int i=n-1;i>0;i--) {
			sumres += arr[i];
			res++;
			if(sumres>halfsum) return res;
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {3,1,7,1};
		int n = arr.length;
		System.out.println(subset(arr,n));
		
	}
}
