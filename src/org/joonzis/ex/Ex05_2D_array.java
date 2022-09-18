package org.joonzis.ex;

public class Ex05_2D_array {

	public static void main(String[] args) {
		
		// 3행 n열
		int[][] arr = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println();
		} 
		
		

	}

}
