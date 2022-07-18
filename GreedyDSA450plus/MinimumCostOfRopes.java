package GreedyDSA450plus;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
	public static int ropes(int[] arr,int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			pq.offer(arr[i]);
		}
		int sum=0;
		int totalsum = 0 ; 
		while(pq.size()>1) {
			int first = pq.poll();
			int second = pq.poll();
			sum = first+second;
			totalsum += sum;
			pq.add(sum);
		}
		return totalsum;
		
	}
	public static void main(String[] args) {
		int[] arr = {4,3,2,6};
		int n = arr.length;
		System.out.println(ropes(arr,n));
	}
}
