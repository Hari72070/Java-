package com.java.tasks;

public class SubArray {

	public static void main(String[] args) {
		int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int currentsum = nums[0];
		int maxsum = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			if(currentsum + nums[i] < nums[i]) {
				currentsum = nums[i];
			}else {
				currentsum = currentsum + nums[i];
			}
			if(currentsum > maxsum) {
				maxsum = currentsum;
			}
		}
		System.out.println(maxsum);
	}

}

//Write java program for Finding maxsubArray sum 
//Eg:int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//Output : 6