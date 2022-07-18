package GreedyDSA450plus;

import java.util.Arrays;

public class MimimumSumOfAbsoluteDifferenceOfPairsOfTwoArrays {
	public static int minimumSum(int[] a,int[] b,int n) {
		Arrays.sort(a);
		Arrays.sort(b);
		int sum=0;
		for(int i=0;i<n;i++) {
			sum += Math.abs(a[i]-b[i]);
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a = {3,2,1};
		int[] b = {2,1,3};
		int n = a.length;
		System.out.println(minimumSum(a,b,n));
	}
}
