package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Fracttionalknapsack {
	public class Item{
		int value;
		int weight;
		Item(int x,int y){
			this.value = x;
			this.weight = y;
		}
	}
	public class itemComparator implements Comparator<Item>{
		@Override
		public int compare(Item a , Item b) {
			double r1 = (double)(a.value)/(double)(a.weight);
			double r2 = (double)(b.value)/(double)(b.weight);
			if(r1<r2) return 1;
			else if(r1>r2) return -1;
			else return 0;
		}
	}
	class Solve{
		double fractionalknapsack(int W,Item arr[],int n) {
			itemComparator ic = new itemComparator();
			Arrays.sort(arr, ic);
	      //  Collections.sort(arr, ic); 
			int curWeight = 0 ; 
			double finalvalue = 0.0;
			
			for(int i=0;i<n;i++) {
				if(curWeight+arr[i].weight<= W) {
					curWeight = curWeight+arr[i].weight;
					finalvalue = finalvalue + arr[i].value;
				}
				
				else {
					int remain = W-curWeight;
					finalvalue += ((double)arr[i].value/(double)arr[i].weight)*(double)remain;
					break;
				}
			}
			return finalvalue;
		}
	}
	public static void main(String[] args) {
		int n=3;
	
		Item arr[] = {{60,10},{100,20},{120,30}};
	}
}
