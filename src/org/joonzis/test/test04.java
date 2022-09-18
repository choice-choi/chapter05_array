package org.joonzis.test;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
//		Test04.java
//		Q. 길이가 5인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 해당 데이터 값을 모두 더해서 합을 출력하기 
//
//		>>선언한 다음 0번 인덱스엔 뭐 넣을지 등.. 스캐너 사용
//		5개 값 다 구하고 합 출력
//		사용자로부터 콘솔입력 받아 -> 스캐너 사용

		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr1 = new int[5];
//		int[] arr2 = {10, 20, 30, 40, 50};
//		
////		int arr2 = sc.nextInt();		
//		
//		int total = 0;
//		
//
//		for(int i=0; i<=arr2.length; i++) {
////			total = total + i;
//			
//			total += arr2[i];
////			System.out.println(arr2[i]);
//			System.out.println(total);
//		}
//			
		Scanner sc = new Scanner(System.in);
		
		직관적인 답)
		int[] arr1 = new int[5];
//		int[] arr2 = {10, 20, 30, 40, 50};
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		
		
		#합 구하려면 입력 출력 for문 같이 쓸 경우)
		int sum = 0; //합 구하려면 이 식 추가
		
		for문을 사용한 답)
//				int total = 0;
//
//				for(int i=0; i<arr1.length; i++) {
//						total += arr1[i];
//					}
//					System.out.println("합계 >> " + total);
//		
//					int total = 0;

		for(int i=0; i<arr1.length; i++) {
			System.out.print(i + "번 인덱스에 입력할 값 >> ");
			arr1[i] = sc.nextInt();
			sum += arr1[i];
		}
				
		
		
		#합 구하려면 입력 출력 for문 각 쓰기)
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i + "번 인덱스에 입력할 값 >> ");
			arr1[i] = sc.nextInt();
	
		int sum = 0; //합 구하려면 이 식 추가
		
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		

	}

}
