package org.joonzis.test;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
//		Test08.java
//		Q. 성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 최대, 최소, 평균 점수를 출력하기
//		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
//		실행 예)
//		바트의 점수 입력 >> 70
//		리사의 점수 입력 >> 100
//
//		>>배열 2개 있음(names-초기화,이름이 다 들어가져있음, scores)

		
		// 1. 크기 5짜리 문자열 배열 names에 학생 이름 넣어서 초기화
		// 2. 크기 5짜리 정수형 배열 scores 선언
		// 3. scores에 점수 입력
		// 4. scores의 최소, 최대, 평균 구하기
		// * names와 scores 인덱스를 동시 진행
		
		String[] names = {"김씨", "이씨", "박씨", "최씨", "정씨"};
		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		//입력 for문
		// i를 변동시키기 위해 for문 사용
		for(int i=0; i<scores.length; i++) {
			System.out.print(names[i] + "의 점수 입력 >> ");	
			scores[i] = sc.nextInt();
		}
		
		// 0 -> 네임즈"김씨" -> 스코어70
		
		
		int min = scores[0]; //비교할 배열은 점수
		int max = scores[0];
		double avg = 0; //값을 대입할 용도여서 0넣음
		int sum = 0;
		// 연산 및 출력 for문
		for(int i=0; i<scores.length; i++) {
			//최소
			if(min > scores[i]) {
				min = scores[i];
			}
			//최소
			if(max < scores[i]) {
				min = scores[i];
			}
		
			//합계
			sum += scores[i];
		}
		
			//평균
		avg = (double)sum/scores.length;
		
		System.out.println("가장 낮은 점수 : " + min);
		System.out.println("가장 높은 점수 : " + max);
		System.out.println("평균 점수 : " + avg);
		
		
		
//		>>나의 오답
//		int[] scores = new int[5];
//		String[] names = {"알파, 바트, 콜라, 디올, 리사"};
//		
//		Scanner sc = new Scanner(System.in);
//				
//		for(String i="알파"; i<String.length; i++) {
//			System.out.println(String[i]);	
//		}
		

		
		
				
		
		
		
		
	}

}
