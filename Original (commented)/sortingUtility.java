import java.util.Scanner;

public class sortingUtility {
	public static void main(String args[]) throws Exception {
		sorting sort = new sorting();

		String list = "";
		int i = 0, n = 0;

		System.out.print("\n Enter size of the array to be randomly generated: ");
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();

		System.out.print("\n Enter MAX array value: ");
		in = new Scanner(System.in);
		int arrayMax = in.nextInt() + 1;

		System.out.print("\n Choose type of array! (Array randomized by default) ");
		System.out.print("\n   1. Randomized.");
		System.out.print("\n   2. Sorted in ascending order.");
		System.out.println("\n   3. Sorted in descending order.");
		System.out.print("\n Your choice: ");
		in = new Scanner(System.in);
		int typeChoice = in.nextInt();

		int elementlist[] = sort.generateArray(arraySize, arrayMax, typeChoice);

		System.out.println();
		System.out.println("Elementlist");
		System.out.println();
		for (int j = 0 ; j < elementlist.length; j++) {
			System.out.println(elementlist[j] + " ");
		}

		long countingStart = System.nanoTime();
		int countingSorted[] = sort.countingSort(elementlist, arrayMax);
		long countingEstimated = System.nanoTime() - countingStart;

		long insertionStart = System.nanoTime();
		int insertionSorted[] = sort.insertionSort(elementlist);
		long insertionEstimated = System.nanoTime() - insertionStart;

		boolean isInsertionSorted = sort.isSorted(insertionSorted);
		boolean isCountingSorted = sort.isSorted(countingSorted);

		

		/*for (int j = 0 ; j < insertionSorted.length; j++) {
			System.out.println(insertionSorted[j] + " ");
		}

		for (int j = 0 ; j < countingSorted.length; j++) {
			System.out.println(countingSorted[j] + " ");
		}*/

		System.out.println("\n");
		System.out.println("===================================================================");
		System.out.println(" Insertion Sort running time: " + insertionEstimated + "ns");
		System.out.println(" Counting Sort running time: " + countingEstimated + "ns");
		System.out.println(" Is array successfuly sorted by Insertion Sort? (boolean): " + isInsertionSorted);
		System.out.println(" Is array successfuly sorted by Counting sort? (boolean): " + isCountingSorted);
		System.out.println("===================================================================");
	}
}