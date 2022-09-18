package org.joonzis.test;

public class test06 {

	public static void main(String[] args) {
//		Test06.java
//		Q. Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력
//
//		>>int[] arr = {13, 22, -3, 92, 55, 5} 배열이용
//		최소, 최대는 여기 값 중에 비교

		int[] arr = {13, 22, -3, 92, 55, 5};
		
		int min = arr[0];	//위 배열에서는 0보다 작은 값이 있으니까 배열에 있는 첫 번째 값을 초기화 해주기
		int max = arr[0];
		

		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		
			if(max < arr[i]) {
				max = arr[i];
			}}
		System.out.println("최소 값 : " + min);
		System.out.println("최대 값 : " + max);


	}

}
