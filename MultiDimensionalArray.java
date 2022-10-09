package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] multiArray = new int[3][3];
		System.out.println(multiArray.length);
		
		for(int row = 0; row < multiArray.length; row++) {
			for(int col = 0; col < multiArray[row].length; col++) {
				multiArray[row][col] = sc.nextInt();
			}
		}
		
		// Printing the Multi-Dimensional Array
//		for(int row = 0; row < multiArray.length; row++) {
//			System.out.println(Arrays.toString(multiArray[row]));
//		}
		
		for(int[] arr : multiArray) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
	}

}
