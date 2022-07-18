package GreedyDSA450plus;

public class CheckItIsPossibleToSurviveOnIsland {
	public static void island(int N,int M,int S) {
		//N => Maximum unit of food that you can buy each day
		//S => no of days you are require to survive
		//M => unit of food required each day to survive
		if(((6*N)<(7*M) && S>6) || M>N){
			System.out.println("No will not able to survive");
		}
		else {
		int days = (S*M)/N;
		if((S*M)%N !=0) {
			days++;
		}
		System.out.println("Yes " + days);
		}
	}
	public static void main(String[] args) {
		int N = 15;
		int M= 2;
		int S = 10;
		island(N,M,S);
	}
}
