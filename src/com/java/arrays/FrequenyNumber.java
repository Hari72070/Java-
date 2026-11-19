package com.java.arrays;

public class FrequenyNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 1, 2, 3, 4, 5, 6, 1, 4, 2 };
		boolean visit[] = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (visit[i])
				continue;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visit[j] = true;
				}
			}
			System.out.println(arr[i] +"count is" +count);
		}
		
	}
}
