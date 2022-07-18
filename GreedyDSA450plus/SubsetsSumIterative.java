package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.List;

public class SubsetsSumIterative {
	public static List<List<Integer>> subset(int[] nums){
		List<List<Integer>> res = new ArrayList<>();//[[]] power sets
		res.add(new ArrayList<>());
		for(int num:nums) {
			int n = res.size();
			for(int j=0;j<n;j++) {
				List<Integer> temp = new ArrayList<>(res.get(j));
				temp.add(num);
				res.add(temp);
			}
		}
		return res;
	}
public static void main(String[] args) {
	int[] nums = {1,2,3};
	System.out.println(subset(nums));
}
}
