package GreedyDSA450plus;

import java.util.Arrays;

public class MaximizeSumOfAnArray {
	public static int maximize(int[]a,int n) {
		Arrays.sort(a);
		long sum =0;
		long mod = (long) Math.pow(10, 9);
		mod = mod+7;
		for(int i=0;i<n;i++) 
			sum += a[i] * i;
		return (int)(sum%mod);
	}
	public static void main(String[] args) {
		int[] a = {5,3,4,2,1};
		int n = a.length;
		System.out.println(maximize(a,n));
	}
}
