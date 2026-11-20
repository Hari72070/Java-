package com.java.arrays.algorithms;

import java.util.Arrays;

public class MergeSort {
	static void divide(int[] arr) {
		int i;
		if (arr.length == 1)
			return;

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}
		divide(left);
		System.out.println(Arrays.toString(left));
		divide(right);
		System.out.println(Arrays.toString(right));
		merge(left, right, arr);
	}

	static void merge(int[] l, int[] r, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < l.length && j < r.length) {
			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}
		}
		while (i < l.length) {
			arr[k++] = l[i++];
		}
		while (j < r.length) {
			arr[k++] = r[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 3, 7, 2 };
		divide(arr);
		System.out.println(Arrays.toString(arr));
	}

}
