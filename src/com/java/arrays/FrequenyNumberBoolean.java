package com.java.arrays;

public class FrequenyNumberBoolean {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 4, 5, 1, 2, 6, 1, 3, 2 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				continue;
			}
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					count++;
				}
			}
			System.out.println(arr[i] + "count is : " + count);
		}
	}
}
