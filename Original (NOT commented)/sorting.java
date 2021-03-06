import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class sorting {
	public static int[] insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int next = list[i];
			int j = i;

			while (j > 0 && list[j - 1] > next) {
				list[j] = list[j - 1];
				j--;
			}
			list[j] = next;
		}

		return list;
	}

	public static int[] countingSort(int[] a, int k) {
		int c[] = new int[k + 1];
		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}

		for (int i = 1; i < k; i++) {
			c[i] += c[i-1];
		}

		int b[] = new int[a.length];
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