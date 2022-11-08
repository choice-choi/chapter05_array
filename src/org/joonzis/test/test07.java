package org.joonzis.test;

import java.util.Arrays;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
//		Test07.java
//		Q. 길이가 10인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 값을 저장한 뒤
//			배열에 있는 정수 중에서 3의 배수만 출력해보자. 
//		1) 길이 10 배열 선언
//		2) 데이터 삽입 for문
//		3) 3의 배수 출력 for문
		

		// 1. 1~10 출력(while) (3의 배수는 제외) / 3으로 나누어 떨어지는 값은 3의 배수에 해당
//		int num = 0;
//		while(num<10) {
//			num++;
//			
//			
//			if(num % 3 != 0) {
//			System.out.println(num);
//		}
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		// 입력
		for(int i=0; i<=arr.length; i++) {
			System.out.print(i + "번 인덱스 값 >> ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
				
		// 출력
		for(int i=0; i<=arr.length; i++) {
			if(arr[i] % 3 == 0) {
				//3의 배수
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}
