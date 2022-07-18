package GreedyDSA450plus;

public class DieHardDieHardGreedy {
	public static int die(int h,int a,int t) {
		while(t-->0) {
			char lastmove = 'x';
			int time=0;
			while(h>0 && a>0) {
				if(lastmove=='w' || lastmove=='f' || lastmove=='x') {
					h=h+3;
					a=a+2;
					lastmove = 'a';
					time++;
				}
				else if(lastmove=='a') {
					if(h-5>0 && a-10>0) {
						h=h-5;
						a = a-10;
						lastmove = 'w';
						time++;
					}
					else if(h-20>0) {
						h=h-20;
						a=a+5;
						lastmove = 'f';
						time++;
					}
					else break;
				}
			}
			return time;
			//System.out.println(time);

		}

		return 0 ; 
	}
public static void main(String[] args) {
	int health = 20;
	int armour = 20;
	int time = 3;
	System.out.println(die(health,armour,time));
}
}
