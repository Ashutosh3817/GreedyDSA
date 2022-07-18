package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumOfAbsoluteDifferenceOfAnyPermutation {
	public static int maximumSum(int[] a,int n) {
		Arrays.sort(a);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n/2;i++) {
			al.add(a[i]);
			al.add(a[n-i-1]);
		}
		if(n%2 !=0) {
			al.add(a[n/2]);
		}
		int maximumSum=0;
		for(int i=0;i<n-1;++i) {
			maximumSum += Math.abs(al.get(i)-al.get(i+1));
		}
		maximumSum += Math.abs(al.get(n-1)-al.get(0));
		return maximumSum;
	}
	public static void main(String[] args) {
		int[]a = { 1, 2, 4, 8 };
		int n = a.length;
		System.out.println(maximumSum(a,n));
	}
}
