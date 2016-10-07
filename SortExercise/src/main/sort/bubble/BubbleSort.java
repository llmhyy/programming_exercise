package sort.bubble;

public class BubbleSort {

	public int[] sort(int[] array) {
		// TODO I am going to do it
		int l = array.length - 1; // Initiate a length variable for later use
		int t; // Initiate a temporary variable
		for (int i = 0; i < l; i++) { // Count the times of overview
			for (int k = 0; k < l-i; k++) { // Overview the array except for the last i items
				if (array[k] > array[k+1]) { // Change if [k] is greater than [k+1]
					t = array[k];
					array[k] = array[k+1];
					array[k+1] = t;
				};
			}
		};	
		/*for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		};*/
		return array;
	}
	
}
