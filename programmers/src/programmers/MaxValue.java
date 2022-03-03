package programmers;

import java.util.*;

public class MaxValue {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		List<Integer> list = new ArrayList<>();
	    for(int i=0; i<nums.length; i++) {
	    	if(nums.length-i == 2) {
	    		break;
	    	}
	    	for(int j=i+1; j<nums.length; j++) {	    		
	    		for(int k = j+1; k<nums.length; k++ ) {
	    			list.add(nums[i] + nums[j] + nums[k]);	    			 
	    		}
	    	 }
	    }
	    System.out.println(list.toString());
	    int result =0;
	    for(int a : list) {
	    	  boolean flag = true;
		      for(int i=2; i<a; i++) {
		    	  if(a%i == 0 ) {
		    		  flag = false;
		    		  break;
		    	  }	    	  	
		      }
	      if(flag) {
	    	  result++;
	       }
	    }
	    System.out.println(result);
//	    if("2" <"10")
	    
	    	
}
}


//list {10, 9, 7, 15, 13, 17}