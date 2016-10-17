package sort.quick;

public class QuickSort {
	int[] arr;
	private void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private void Qsort(int start, int end) {
		if (start >= end)
			return;
		int mid = arr[end];
		int left = start, right = end - 1;
		while (left < right) {
			while (arr[left] < mid && left < right)
				left++;
			while (arr[right] >= mid && left < right)
				right--;
			swap(left, right);
		}
		if (arr[left] >= arr[end])
			swap(left, end);
		else
			left++;
		Qsort(start, left - 1);
		Qsort(left + 1, end);
	}

	public int[] sort(int[] array) {
		arr = array;
		Qsort(0, arr.length - 1);
		return arr;
	}
}
