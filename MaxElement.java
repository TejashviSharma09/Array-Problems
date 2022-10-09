package ArrayProblems;

import java.util.Arrays;

public class MaxElement {

	public static void main(String[] args) {
		
		int[] arr = {2, 44, 3, 1, -6, 999, 7};
//		System.out.println(maxElement(arr));
		System.out.println(maxElementRange(arr, 1, 4));
		
		
		
		// Passing Array in a function
//		int[] arr = {1, 4, 5, 9};
//		System.out.println(Arrays.toString(arr));
//		change(arr);
//		System.out.println(Arrays.toString(arr));
		
	}
	
	static void change(int[] arr) {
		arr[0] = 10;
	}
	
	static int maxElement(int[] arr) {
		
		// Edge Case - If the array is empty
		if (arr.length == 0)
			return -1;
		
		// Finding the Max element
		int maxElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxElement)
				maxElement = arr[i];
		}
		return maxElement;	
	}
	
	
	static int maxElementRange(int[] arr, int start, int end) {
		
		// Edge Case
		if ((arr.length == 0) || (start > end))
			return -1;
		
		// Finding Maximum
		int maxElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxElement)
				maxElement = arr[i];
		}
		return maxElement;
		
	}

}

