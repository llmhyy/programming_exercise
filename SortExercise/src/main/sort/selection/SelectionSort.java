package sort.selection;

public class SelectionSort {
	public int[] sort(int[] array) {
		int l = array.length - 1;
		int temp;
		int k;
		for (int i = 0; i < l; i++) {
			k = l;
			temp = array[l];
			for (int j = l; j > i - 1; j--) {
				if (array[j] < temp) {
					temp = array[j];
					k = j;
				};
			};
			array [k] = array[i];
			array [i] = temp;
		}
		return array;
	}
}
