package day006;

import java.util.Arrays;

public class TestArrOp {

	public static void main(String[] args){
		
		/*int[] arr = new int[5];
		for(int i = 0; i < arr.length - 1; i++){
			arr[i] = (i+1) * 10;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------------");
		for(int i = 4; i >= 1; i--){
			arr[i] = arr[i-1];
			System.out.println(arr[i]);
		}
		arr[0] = 50;
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------------");
		//数组删除第i个元素
		//i = 3
		for(int i = 2; i < arr.length - 1; i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
		
		int[][] ar1 = new int[5][4];
		System.out.println(ar1[0].length);
		System.out.println(ar1[1][1]);
		int[][] ar2 = {{1,2,3},{1,2}};
		System.out.println(ar2[0].length);
		System.out.println(ar2[1].length);*/
		
		int[][] arra1 = {{1, 3, 4}, {3, 4}, {2, 4, 5 ,6}};
		for(int i = 0; i < arra1.length; i++){
			for(int j = 0; j < arra1[i].length; j++){
				System.out.print(arra1[i][j] + " ");
			}
			System.out.println('\n');
			
		}
		
	}
}
