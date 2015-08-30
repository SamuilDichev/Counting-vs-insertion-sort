public class insertionComplexity {
	public static void main(String args[]) throws Exception {
		sorting sort = new sorting();

		String list = "";
		int i = 0, n = 0;
		long estimatedComplexity1 = 0;
		long estimatedComplexity2 = 0;
		long estimatedComplexity3 = 0;
		int arraySize = 0;
		int arrayMax = 0;
		int typeChoice = 0;

		for (int j = 0 ; j < 100; j++) {
			arraySize = 1000*(j+1);
			arrayMax = arraySize;
			
			typeChoice = 1;
			int elementlist1[] = sort.generateArray(arraySize, arrayMax, typeChoice);
			long insertionStart1 = System.nanoTime();
			int insertionSorted1[] = sort.insertionSort(elementlist1);
			estimatedComplexity1 = System.nanoTime() - insertionStart1;

			typeChoice = 2;
			int elementlist2[] = sort.generateArray(arraySize, arrayMax, typeChoice);
			long insertionStart2 = System.nanoTime();
			int insertionSorted2[] = sort.insertionSort(elementlist2);
			estimatedComplexity2 = System.nanoTime() - insertionStart2;

			typeChoice = 3;
			int elementlist3[] = sort.generateArray(arraySize, arrayMax, typeChoice);
			long insertionStart3 = System.nanoTime();
			int insertionSorted3[] = sort.insertionSort(elementlist3);
			estimatedComplexity3 = System.nanoTime() - insertionStart3;

			System.out.println(arraySize + "," + estimatedComplexity3 + "," + estimatedComplexity1 + "," + estimatedComplexity2);
		}

		

		
	}
}