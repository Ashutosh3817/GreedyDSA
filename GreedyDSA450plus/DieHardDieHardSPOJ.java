package GreedyDSA450plus;

public class DieHardDieHardSPOJ {
	static int dp[][] = new int[1001][1001];
	public static int die(int h,int a,int i) {
		  if(h<=0 || a<=0) return 0 ;  
		  if(dp[h][a]!=-1) {
			return dp[h][a];  
		  }
		  int x,y,z;
		  x=y=z=0;
		  if(i!=1) x = 1 + die(h+3,a+2,1);
		  if(i!=2) y = 1 + die(h-5,a-10,2);
		  if(i!=3) z = 1 + die(h-20,a+5,3);
		  return dp[h][a] = Math.max(x,Math.max(y, z));
	}
	public static int solve(int h,int a,int t) {
		while(t-->0) {
			System.out.println(Math.max(die(h+3,a+2,1),Math.max(die(h-5,a-10,2),die(h-20,a+5,3))));
		}
		return 0 ; 
	}
	public static void main(String[] args) {
		int t = 3;
		int health = 20 , armour = 20;
		solve(health,armour,t);
		
	}
}
