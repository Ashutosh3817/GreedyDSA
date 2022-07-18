package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

class Pair{
	int first,second;
	Pair(int first,int second){
		this.first = first;
		this.second = second;
	}
}

class SortPair implements Comparator<Pair>{
	public int compare(Pair a,Pair b) {
		return a.first - b.first;
	}
}

public class BuyMaximumStocksIfiStocksCanBeBoughtithDay {
	
	public static int stocks(int[] arr1,int n , int k) {
		Pair[] arr = new Pair[n];
		for(int i=0;i<n;i++) {
			arr[i] = new Pair(arr1[i],i+1);
		}
        Arrays.sort(arr, new SortPair());
        for(int i=0;i<n;i++) System.out.println(arr[i].first);
        int ans = 0 ; 
        for(int i=0;i<n;i++) {
        	int price = arr[i].first;
        	int stock = arr[i].second;
        	if(price*stock<=k) {
        		ans += stock;
        		k -= (price*stock);
        		
        	}
        	else {
        		ans += (k/price);
        		k -= price*(k/price);
        	}
        }
		return ans;	
	}
	public static void main(String[] args) {
		int[] arr = {10,7,19};
		int k=45;
		int n = arr.length;
		System.out.println(stocks(arr,n,k));
	}
}
