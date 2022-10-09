package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

//		ArrayList<Integer> arr = new ArrayList<>(5);
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i <= 7; i++) {
//			arr.add(sc.nextInt());
//		}
		
//		for(int element : arr) {
//			System.out.print(element + " ");
//		}
//		System.out.println(arr);
		
		ArrayList<Integer> arr = new ArrayList<>() {{ add(1); add(2); add(3); add(122); add(11); }};
		arr.set(2, 33);
		System.out.println(arr);
		arr.remove(0);
//		System.out.println(arr);
		for(int i = 0; i <= arr.size() - 1; i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
