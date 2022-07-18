package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfAGivenString {
	static List<String> al = new ArrayList<String>();
	public  static List<String> find_permutation(String S){
		permutation(S,0,S.length()-1);
		Collections.sort(al);
		return al;
	}
	
	static void permutation(String s,int l,int r) {
		if(l==r) {
			al.add(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s=swap(s,l,i);
			permutation(s,l+1,r);
			s = swap(s,l,r);
		}
	}
	public static String swap(String s,int a,int b) {
		char[] array = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}
	public static void main(String[] args) {
		String s = "ABC";
		System.out.println(find_permutation(s));
	}
}
