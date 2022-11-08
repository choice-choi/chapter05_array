package org.joonzis.test.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		Test08.java
//		Q. 성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 최대, 최소, 평균 점수를 출력하기
//		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
//		실행 예)
//		바트의 점수 입력 >> 70
//		...
//		리사의 점수 입력 >> 100
		
		/*
		 * 1. 크기 5짜리 int형 배열 scores 선언
		 * 2. scores에 점수 입력
		 * 3. scores 배열의 최대, 최소, 평균 구하기
		 * 4. 크기 5짜리 String형 배열 names 생성과 동시에 값 적용
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"김씨","이씨","박씨","최씨","정씨"};
		int[] scores = new int[5];	// new 연산자를 사용해 scores 배열 객체를 생성
		// 값의 목록은 없지만 향후 값들을 저장할 목적으로 배열을 미리 생성할 수 있다
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(names[i] + "의 점수 입력 >> ");
			scores[i] = sc.nextInt();
		}
		
		int max = scores[0];
		int min = scores[0];
		int sum = 0;
		double avg = 0;
		int maxIdx = 0;
		int minIdx = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
			
			if(min > scores[i]) {
				min = scores[i];
				minIdx = i;
			}
			
			sum += scores[i];
		}
		avg = (double)sum/scores.length;
		
		System.out.println("최대 값 : "+max + ", 학생 : " + names[maxIdx]);
		
		
		
		
	}
}
