package GreedyDSA450plus;

import java.util.Arrays;

public class MaximumSumAfterKNegations {
	public static int maxSum(int[]a,int n,int k) {
		int neg = 0 ; 
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			if(a[i]<0) neg++;
		}
		int count = 0 ;
		if(neg>0) {
			for(int i=0;i<k && i<neg;i++) {
				a[i]= a[i] * (-1);
				count ++;
			}
		}
		if(count < k) {
			k = k-count;
			Arrays.sort(a);
			int i=0;
			while(i<k) {
				a[i] = a[i] * (-1);
				k--;
			}
		}
		int sum=0;
		for(int j=0;j<n;j++) 
			sum += a[j];

		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
		int k=5;
		int n = arr.length;
		System.out.println(maxSum(arr,n,k));
	}
}
