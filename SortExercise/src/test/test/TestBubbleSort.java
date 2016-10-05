package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.bubble.BubbleSort;

public class TestBubbleSort {

	int[] array = new int[]{1,1,2,2,3,6,7,9,10,12};
	
	
	@Test
	public void test1() {
		
		int[] unsortedArray = new int[]{12,2,6,7,9,10, 3, 1,1,2};
		
		BubbleSort sort = new BubbleSort();
		
		int[] expected = sort.sort(unsortedArray);
		
		assertArrayEquals(expected, array);
	}
	
	@Test
	public void test2() {
		
		int[] unsortedArray = new int[]{10, 3, 2,6,7,12,9,1,1,2};
		
		BubbleSort sort = new BubbleSort();
		
		int[] expected = sort.sort(unsortedArray);
		
		assertArrayEquals(expected, array);
	}
	
	@Test
	public void test3() {
		
		int[] unsortedArray = new int[]{2,6,7,9,1,1,12,10, 3, 2};
		
		BubbleSort sort = new BubbleSort();
		
		int[] expected = sort.sort(unsortedArray);
		
		assertArrayEquals(expected, array);
	}

}
