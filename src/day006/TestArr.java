package day006;

import java.util.Arrays;

public class TestArr {

	public static void main(String[] args){
		
		/*int[] arr = new int[]{0,1,2,3,4};
		int[] arr2 = {6,6,6,6,6,6};
		for(int i = 0; i < 5; i++){
			System.out.println(arr[i]);
			System.out.println(arr2[i]);
		}
		int[] arr3 = new int[4];
		arr3[1] = 34;
		
		System.out.println(arr3[1]);
		
		System.out.println(arr.length);*/
		
		
		int[] arr1 = {1,3,4,5};
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 1, 3);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr2, 20);
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.length);
		arr3 = Arrays.copyOf(arr3, arr3.length + 1);
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.length);
		
		
	}
}
