package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopInACandyStore {
	public static void candy(int[] arr,int n,int k){
		ArrayList<Integer> al = new ArrayList<>();
		Arrays.sort(arr);
		int mi=0;
		for(int i=0;i<n;i++) {
			mi += arr[i];
			n = n-k;
		}
		al.add(mi);
		reverse(arr,n,k);
		int max=0;

		for(int j=0;j<n;j++) {
			max += arr[j];
		System.out.println(arr[j]);
			n = n - k ;
		}
		al.add(mi);
		al.add(max);
		System.out.println(al);
	}
		public static void reverse(int[] arr,int n,int k ) {
			
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
		for(int i=0;i<n;i++) {
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] =temp;
			n--;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		}
		
	public static void main(String[] args) {
		int[] arr = {3,2,1,4};
		int n=4;
		int k=2;
		candy(arr,n,k);
	}
}
