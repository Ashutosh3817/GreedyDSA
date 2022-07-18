package GreedyDSA450plus;

public class ShortestJobFirstCPUScheduling {
	class Process{
		int pid;
		int bt;
		Process(int pid,int bt){
			this.pid = pid;
			this.bt = bt;
		}
	}
	public static boolean compare(Process a,Process b) {
		return (a.bt<b.bt);
	}
	public static void main(String[] args) {
		Process proc[] = {{1,6},{2,8},{3,7},{4,3}};
		
	}
}
