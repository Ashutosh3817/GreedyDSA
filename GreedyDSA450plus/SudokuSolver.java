package GreedyDSA450plus;

import java.util.ArrayList;

public class SudokuSolver {
	ArrayList<Integer> visited(n,false);
	public static boolean solver(int[][] board) { 
		helper(board,0,0);
		
		return true;		
	}
	public static boolean helper(int[][] board,int row,int col) {
		if(row==board.length) return true;
		
		int nrow=0;
		int ncol=0;
		if(col!=board.length-1) {
			nrow = row;
			ncol = col+1;
		}
		else {
			nrow = row+1;
			ncol = 0 ;
		}
		if(board[row][col]!=0) {
			if(helper(board,nrow,ncol)) return true;
		}
	
		else {
			for(int i=1;i<9;i++) {
				if(isSafe(board,row,col,i)) {
					board[row][col] = i;
					if(helper(board,row,col)) {
						return true;
					}
					else {
						board[row][col] = 0;
					}
				}
			}
		}
		
		    
		return false;
		
	}
	public static boolean isSafe(int[][] board,int row,int col,int number){
		for(int i=0;i<board.length;i++) {
			if(board[i][col]==number) return false;
			if(board[row][i]==number) return false;
		}
		int sr = (row/3)*3;
		int sc = (col/3) *3;
		for(int i=sr;i<sr+3;i++) {
			for(int j=sc;j<sc+3;j++) {
				if(board[i][j]==number) return false;
			}
		}
		return true;
	}
	
	  static void printGrid (int board[][])
	    {
	        int N=9;
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++)
	                System.out.print(board[i][j]+" ");
	        }
	    }
	public static void main(String[] args) {
		int[][] board = {{3, 0, 6 ,5 ,0 ,8 ,4 ,0, 0},
		                 {5, 2 ,0 ,0 ,0 ,0 ,0 ,0 ,0},
		                 {0 ,8 ,7 ,0 ,0 ,0 ,0 ,3, 1 },
		                 {0 ,0 ,3 ,0 ,1 ,0 ,0 ,8 ,0},
		                 {9,0, 0, 8, 6, 3, 0 ,0 ,5},
		                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
		                 {1, 3 ,0 ,0 ,0 ,0 ,2 ,5 ,0},
		                 {0 ,0 ,0 ,0 ,0 ,0 ,0 ,7 ,4},
		                 {0 ,0, 5, 2 ,0, 6, 3, 0, 0,}};
	System.out.println(solver(board));
	
	}
}
