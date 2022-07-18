package GreedyDSA450plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public  class ActivitySelectionProblem {
	static class meeting{
		int start ;
		int end;
		int pos;
		meeting(int start,int end,int pos){
			this.start = start;
			this.end = end;
			this.pos = pos;
		}
	}
	public static class meetingComparator implements Comparator<meeting>{
		
		
		public int compare(meeting o1,meeting o2) {
			if(o1.end<o2.end) 
				return -1;
			
			else if(o1.end>o2.end) 
				return 1;
			
			
			return 0;
		
		}
//@Override
	//	public int compare(meeting o1, meeting o2) {
		//	// TODO Auto-generated method stub
			//return 0;
}
	//}
	static class Solution {
	    static void maxMeetings(int start[], int end[], int n) {
	        ArrayList<meeting> meet = new ArrayList<>();
	        
	        for(int i = 0; i < start.length; i++)
	            meet.add(new meeting(start[i], end[i], i+1));
	        
	        meetingComparator mc = new meetingComparator(); 
	        Collections.sort(meet, mc); 
	        ArrayList<Integer> answer = new ArrayList<>();
	        answer.add(meet.get(0).pos);
	        int limit = meet.get(0).end; 
	      int count=0;

	        for(int i = 1;i<start.length;i++) {
	            if(meet.get(i).start > limit) {
	              

	                limit = meet.get(i).end; 
	                answer.add(meet.get(i).pos);
	            }
	           
	        }
	        
	        for(int i = 0;i<answer.size(); i++) 
	       System.out.print(answer.get(i) + 1);
	       // System.out.println(425);
	          //int   count = answer.get(i);
	        
	      //  return count;
	    }
	}
	public void main(String[] args) {
		int N = 6;
		int start[] = {1,3,0,5,8,5};
		int end[] =  {2,4,6,7,9,9};
		ActivitySelectionProblem.Solution s = new Solution();
		s.maxMeetings(start, end, N);
	
	}
	}

