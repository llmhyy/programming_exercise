package sort.quick;

public class QuickSort {
	int[] arr;
	private void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private void qSort(int start, int end) {
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
		if (arr[left] > arr[end])
			swap(left, end);
		else
			left++;
		qSort(start, left - 1);
		qSort(left + 1, end);
	}

	public int[] sort(int[] array) {
		arr = array;
		qSort(0, arr.length - 1);
		return arr;
	}
	
	public static void main(String[] arg){
		int[] unsortedArray = new int[]{10, 3, 2,6,7,12,9,1,1,2};
		
		QuickSort sort = new QuickSort();
		
		int[] expected = sort.sort(unsortedArray);
		
		for(int n: expected){
			System.out.print(n + " ");			
		}
	}
}
