public class CountingVSInsertion {
	public static void main(String args[]) throws Exception {
		sorting sort = new sorting();

		String list = "";
		int i = 0, n = 0;
		long estimatedComplexity1 = 0;
		long estimatedComplexity2 = 0;
		long estimatedComplexity3 = 0;
		long estimatedComplexity4 = 0;
		long estimatedComplexity5 = 0;
		int arraySize = 0;
		int arrayMax = 0;
		int arrayMax1 = 0;
		int arrayMax2 = 0;
		int arrayMax3 = 0;
		int arrayMax4 = 0;
		int arrayMax5 = 0;
		int typeChoice = 1;

		for (int j = 0 ; j < 50; j++) {
			arraySize = 1000*(j+1);
			typeChoice = 1;
			arrayMax = arraySize;

			int elementlist[] = sort.generateArray(arraySize, arrayMax, typeChoice);

			arrayMax3 = arraySize*10;
			int elementlist3[] = sort.generateArray(arraySize, arrayMax3, typeChoice);
			long countingStart3 = System.nanoTime();
			int countingSorted3[] = sort.countingSort(elementlist3, arrayMax3);
			estimatedComplexity3 = System.nanoTime() - countingStart3;

			typeChoice = 1;
			arrayMax = arraySize*10;
			int elementlist4[] = sort.generateArray(arraySize, arrayMax, typeChoice);
			long insertionStart4 = System.nanoTime();
			int insertionSorted4[] = sort.insertionSort(elementlist4);
			estimatedComplexity4 = System.nanoTime() - insertionStart4;

			typeChoice = 3;
			arrayMax = arraySize*10;
			int elementlist5[] = sort.generateArray(arraySize, arrayMax, typeChoice);
			long insertionStart5 = System.nanoTime();
			int insertionSorted5[] = sort.insertionSort(elementlist5);
			estimatedComplexity5 = System.nanoTime() - insertionStart5;

			//boolean isInsertionSorted = sort.isSorted(insertionSorted);
			//boolean isCountingSorted = sort.isSorted(countingSorted);

			System.out.println(arraySize + "," + estimatedComplexity3 + "," + estimatedComplexity4 + "," + estimatedComplexity5);
		}
	}
}