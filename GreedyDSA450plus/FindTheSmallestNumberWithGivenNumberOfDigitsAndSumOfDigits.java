package GreedyDSA450plus;

public class FindTheSmallestNumberWithGivenNumberOfDigitsAndSumOfDigits {
	static int sum(int n) {
		int sum=0;
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		
		return sum;
	}
	static String smallestNumber(int S,int D) {
		int n=1;
		for(int i=1;i<D;i++) {
			n = n*10;
		}
		int b = n* 10;
		int ans = -1;
		for(int i=n;i<b;i++) {
			int sum = sum(i);
			if(sum==S) {
				ans = i ;
			break;
			}
		}
		String s = String.valueOf(ans);
		return s;
	}
	public static void main(String[] args) {
		int S=20 ,D=3;
		System.out.println(smallestNumber(S,D));
	}
}
