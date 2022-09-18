package org.joonzis.ex;

public class Ex04_2D_array {

	public static void main(String[] args) {
		
		// 2행 3열 정수형 배열 arr 작성
		int[][] arr = {
				{1,2,3},
				{4,5,6}
				};
		// 아래 식 통으로 암기할 것
		int total = 0;
		
		// i:행 , j:열
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println();
		} 
		
		// 위 식을 활용하여 합계와 평균을 구할 수 있음
		// 평균: 합계 % 배열길이
		
		
	}

}
