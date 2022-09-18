package org.joonzis.test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
//		Test03.java
//		Q. Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력
//
//		>>모든 값을 필요로 하면 고정 for문 사용 / 총점, 평균 식 사용
		Scanner sc = new Scanner(System.in);
		
//		int[] arr1 = new int[7];
		int[] arr2 = {10, 20, 50, 60, 13, 25, 97};

				// 아래 식 통으로 암기할 것
				int total = 0;
				
				// i:행 , j:열
				for(int i=0; i<arr2.length; i++) {
//						System.out.println(arr2[i]+" ");
						total += arr2[i];						
					}
					System.out.println("총점 >> " + total);
					System.out.println("평균 >> " + total / arr2.length);
					// 위 식을 활용하여 합계와 평균을 구할 수 있음
					// 평균: 합계 % 배열길이
	
				
					답 구하기
					#1) 총점 구하기
					int[] arr = {10, 20, 50, 60, 13, 25, 97};
					
					int sum = 0;
					for(int i=0; i<arr.length; i++) {
						sum = sum + arr[i];					
					
					#2) 평점 구하기
					double avg = (double) sum/arr.length;
					}
					System.out.println("arr 배열의 총점 : " + sum);
					System.out.println("arr 배열의 평균 : " + avg);
					
		} 
			
	}
	
	
	Q. Test02.java 의 짝수 인덱스 값(0번째,2번째 값..즉, 10, 50, 13,97)들을 모두 더하고, 총점과 평균을 출력
	
	int[] arr = {10, 20, 50, 60, 13, 25, 97};
	
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		if(i%2==0) {
			sum = sum + arr[i];	
		}			
	}
	
	#2) 평점 구하기
	double avg = (double) sum/arr.length;
	
	System.out.println("arr 배열의 총점 : " + sum);
	System.out.println("arr 배열의 평균 : " + avg);


