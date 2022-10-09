package ArrayProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayListExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Declaring and Initializing the Multi-Dimensional ArrayList
		ArrayList<ArrayList<Integer>> arrMulti = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			arrMulti.add(new ArrayList<>());
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				arrMulti.get(i).add(sc.nextInt());
			}
		}
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(arrMulti.get(i));
//		}
		System.out.println(arrMulti);
		
	}

}
