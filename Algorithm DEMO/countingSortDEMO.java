import java.util.Scanner;
import java.util.Arrays;

public class countingSortDEMO {
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

		System.out.println("\n Input: " + Arrays.toString(elementlist));
		System.out.println(" Input Size: " + arraySize);
		System.out.println(" Input Max Value: " + (arrayMax - 1));

		long countingStart = System.nanoTime();
		int countingSorted[] = sort.countingSort(elementlist, arrayMax);
		long countingEstimated = System.nanoTime() - countingStart;
		
		boolean isCountingSorted = sort.isSorted(countingSorted);

		System.out.println("\n");
		System.out.println("===================================================================");
		System.out.println(" Counting Sort running time: " + countingEstimated + "ns");
		System.out.println(" Is array successfuly sorted by Counting sort? (boolean): " + isCountingSorted);
		System.out.println("\n Output: " + Arrays.toString(countingSorted));
		System.out.println("===================================================================");
	}
}