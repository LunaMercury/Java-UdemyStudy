package section19;

import java.util.Arrays;

public class ArrayMagic {
	public boolean doesHaveElementGreaterThan(int[] array, int number) {
		for (int arr : array) {
			if (arr > number) {
				return true;
			}
		}
		return false;
	}

	public int findSecondLargestElement(int[] array) {
		if (array.length < 2) {
			return -1;
		}

		int sameAmount = 1;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				sameAmount++;
			}
		}
		if (sameAmount == array.length) {
			return -1;
		}

		int first = Integer.MIN_VALUE + 1;
		int second = Integer.MIN_VALUE;
		for (int number : array) {
			if (number > first) {
				second = first;
				first = number;

			}
			if (number < first && number > second) {
				second = number;
			}
		}

		return second;
	}

	public boolean isSorted(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		Arrays.sort(sortedArray);

		for (int i = 0; i < array.length; i++) {
			if (array[i] != sortedArray[i]) {
				return false;
			}
		}

		return true;
	}

	public int[] reverseArray(int[] array) {
		int[] reversed = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversed[array.length - 1 - i] = array[i];
		}
		return reversed;
	}

	public static void main(String[] args) {
		ArrayMagic arrays = new ArrayMagic();

//		int[] array = { 1, 2, 3, 4, 5 };
//		int number = 10;

//		System.out.println(arrays.doesHaveElementGreaterThan(array, number));

		int[] array = { 5, 7, 9, 2, 4, 9 };
//		int[] array = { 1, 1, 1, 1 };
//		int[] array = { 7 };
//		System.out.println(arrays.findSecondLargestElement(array));

//		System.out.println(arrays.isSorted(array));

		System.out.println(Arrays.toString(arrays.reverseArray(array)));

	}

}
