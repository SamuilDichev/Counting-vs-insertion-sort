public class countingComplexity {
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
		int arrayMax1 = 0;
		int arrayMax2 = 0;
		int arrayMax3 = 0;
		int arrayMax4 = 0;
		int arrayMax5 = 0;
		int typeChoice = 1;

		for (int j = 0 ; j < 1000; j++) {
			arraySize = 1000*(j+1);
			typeChoice = 1;
			
			arrayMax1 = arraySize/10;
			int elementlist1[] = sort.generateArray(arraySize, arrayMax1, typeChoice);
			long countingStart1 = System.nanoTime();
			int countingSorted1[] = sort.countingSort(elementlist1, arrayMax1);
			estimatedComplexity1 = System.nanoTime() - countingStart1;

			arrayMax2 = arraySize;
			int elementlist2[] = sort.generateArray(arraySize, arrayMax2, typeChoice);
			long countingStart2 = System.nanoTime();
			int countingSorted2[] = sort.countingSort(elementlist2, arrayMax2);
			estimatedComplexity2 = System.nanoTime() - countingStart2;

			arrayMax3 = arraySize*10;
			int elementlist3[] = sort.generateArray(arraySize, arrayMax3, typeChoice);
			long countingStart3 = System.nanoTime();
			int countingSorted3[] = sort.countingSort(elementlist3, arrayMax3);
			estimatedComplexity3 = System.nanoTime() - countingStart3;

			arrayMax4 = 1000;
			int elementlist4[] = sort.generateArray(arraySize, arrayMax4, typeChoice);
			long countingStart4 = System.nanoTime();
			int countingSorted4[] = sort.countingSort(elementlist4, arrayMax4);
			estimatedComplexity4 = System.nanoTime() - countingStart4;

			arrayMax5 = 10000000;
			int elementlist5[] = sort.generateArray(arraySize, arrayMax5, typeChoice);
			long countingStart5 = System.nanoTime();
			int countingSorted5[] = sort.countingSort(elementlist5, arrayMax5);
			estimatedComplexity5 = System.nanoTime() - countingStart5;

			System.out.println(arraySize + "," + estimatedComplexity5 + "," + estimatedComplexity3 + "," + estimatedComplexity2 + "," + estimatedComplexity1 + "," + estimatedComplexity4);
		}

		

		
	}
}