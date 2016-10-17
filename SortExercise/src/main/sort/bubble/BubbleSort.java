package sort.bubble;

public class BubbleSort {
int plus;
int check;
	public int getSum(int a, int b){
				int sum = 0;
				plus = a ^ b;
				check = (a & b) << 1;
				if (check == 0) {
					sum = plus;
				} else {
					System.out.println(plus);
					System.out.println(check);
					getSum(plus, check);
				}
				System.out.println(sum);
				return sum;
	}
	public static void reverss(String str){
	char[] store = str.toCharArray();
	char[] output = store;
	int pointer = 0;
	int end = store.length - 1;
	while (end > pointer){
		char temp = store[end];
		store[end] = store [pointer];
        store[pointer] = temp;
        pointer++;
        end--;
    }
	new String(output);
	System.out.println(output);
	}

//			for(int m=0; m<array.length; m++){
//				System.out.print(array[m]+",");				
//			}
//			System.out.println();
//		};	
		/*for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		};*/
				public int[] sort(int[] array) {
					int l = array.length - 1; // Initiate a length variable for later use
					int t; // Initiate a temporary variable
					for (int i = 0; i < l; i++) { // Count the times of overview
						for (int k = l; k > i; k--) { // Overview the array except for the last i items
							if (array[k] < array[k-1]) { // Change if [k] is greater than [k+1]
								t = array[k];
								array[k] = array[k-1];
								array[k-1] = t;
							};
						}
					getSum(100,8);
					String a="Hello";
					reverss(a);
	}
					return array;
	
				}
}
