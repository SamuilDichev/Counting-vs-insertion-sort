import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class sorting {
	public static int[] insertionSort(int[] list) {
		// Go through the array
		for (int i = 1; i < list.length; i++) {
			// Let next = current element in the array
			int next = list[i];
			int j = i;

			// Keep going back through the array as long as the index
			// is bigger than 0 AND the element at the previous index
			// is bigger than the element at the current index.
			while (j > 0 && list[j - 1] > next) {
				// make the current element equal the previous element
				list[j] = list[j - 1];
				// go back one index
				j--;
			}
			// Do when one of the conditions in the while loop is
			// not met. Let the current element in the array = next
			list[j] = next;
		}

		return list;
	}

	public static int[] countingSort(int[] a, int k) {
		// Array C for the counters with size = k + 1
		int c[] = new int[k + 1];

		// Go through all elements in the array
		for (int i = 0; i < a.length; i++) {
			// Store number of occurances of each
			// element in the count array C 
			// at an index equal to the element
			c[a[i]]++;
		}
		
		// Change the count array C to make it store at
		// each index the sum of the counts before it.
		for (int i = 1; i < k; i++) {
			c[i] += c[i-1];
		}

		// Array B for the sorted values with size = size of A
		int b[] = new int[a.length];
		// Match each value from array A to an index from array C.
		// Decrement the value at the matched index from array C.
		// Take the decremented value and match it to an index
		// from array B. At that index, put the value from array A
		for (int i = a.length - 1; i >= 0; i--) {
			b[--c[a[i]]] = a[i];
		}

		return b;
	}

	public static int[] generateArray(int arraySize, int arrayMax, int typeChoice) {
		Random generator = new Random();
		int elementlist[] = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			elementlist[i] = generator.nextInt(arrayMax);
		}

		if (typeChoice == 2) {
			Arrays.sort(elementlist);
		}

		if (typeChoice == 3) {
			Arrays.sort(elementlist);

			for(int i= 0 ; i < elementlist.length / 2; i++) {
				int temp = elementlist[i];
				elementlist[i] = elementlist[elementlist.length-(i+1)];
				elementlist[elementlist.length - (i + 1)] = temp;
			}
		}

		return elementlist;
	}

	public static boolean isSorted(int[] list) {
		boolean sorted = true;
		for (int z = 1; z < list.length; z++) {
			if(list[z-1] > list[z]){
				sorted = false;   
			}
		}

		return sorted;
	}
}