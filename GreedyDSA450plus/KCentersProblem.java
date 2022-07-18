package GreedyDSA450plus;

import java.util.ArrayList;

public class KCentersProblem {
	static int maxIndex(int[] dist,int n) {
		int mi=0;
		for(int i=0;i<n;i++) {
			if(dist[i]>dist[mi]) mi = i  ; 
		}
		return mi;
	}
	static void selectKcities(int n,int weights[][],int k) {
		int[] dist = new int[n];
		ArrayList<Integer> centers = new ArrayList<>();
		for(int i=0;i<n;i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		int max=0;
		for(int i=0;i<k;i++) {
			centers.add(max);
			for(int j=0;j<n;j++) {
				//update the distance of the cities to their closest centers
				dist[j] = Math.min(dist[j], weights[max][j]);
			}
			max = maxIndex(dist,n);
			
		}
	//	System.out.println(dist[max]);
		
		for(int i=0;i<centers.size();i++) {
			System.out.println(centers.get(i) + "s ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		int n=4;
		int[][] weights = new int[][] {{0,4,8,5},
			                           {4,0,10,7},
			                           {8,10,0,9},
			                           {5,7,9,0}};
		int k=2;
		selectKcities(n,weights,k);
		}

}
