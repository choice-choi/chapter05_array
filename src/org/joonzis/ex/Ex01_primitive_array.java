package org.joonzis.ex;

import java.util.Arrays;

public class Ex01_primitive_array {

	public static void main(String[] args) {
		
		// 선언과 초기화는 다름

		// arr1 라는 정수형 배열명, 크기는 3으로 선언
		
		int[] arr1 = new int[3];	// 길이가 3인 arr 배열 생성하는 식, 크기가 3이기 때문에 인덱스는 0, 1, 2 존재
		
		// arr2 라는 정수형 배열. 10, 20, 30으로 초기화
		int[] arr2 = {10, 20, 30};
		
//		System.out.println(arr2);
		
		
		// 배열 내 전체 데이터 확인
		// 1. Arrays.toString() 메소드 사용			/Arrays라는 클래스와 .toString메소드 사용
		System.out.println(Arrays.toString(arr2));
		
		// 2. 반복문 이용 
		// 배열은 index 번호로 접근 System.out.println(arr2[2]);
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);	//index 접근할 때도 대괄호 사용함
		}
		
		System.out.println(arr2[2]);
		arr2[2] = 40;
		System.out.println(arr2[2]);
		
		
		// 에러_인데스 범위를 벗어난 요소(예외 발생)
		System.out.println(arr2[3]);
		
	}

}
