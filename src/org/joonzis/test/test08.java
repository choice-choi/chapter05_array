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
		// 4. scores 배열의 최소, 최대, 평균 구하기
		// * names와 scores 인덱스를 동시 진행
		
		String[] names = {"김씨", "이씨", "박씨", "최씨", "정씨"};
		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		//입력 for문
		// i를 변동시키기 위해 for문 사용
		for(int i=0; i<scores.length; i++) {
			//scores 배열의 길이만큼 점수 저장 받아야하므로 scores.length 필요 
			System.out.print(names[i] + "의 점수 입력 >> ");	
			//선언과 동시에 값을 대입 받은 초기화 작업을 통해 각 배열에 값이 들어가 있고, 그럼 몇 번째 names 배열의 이름이 출력될지 뽑히는 코드
			scores[i] = sc.nextInt();	
			//스캐너를 통해 입력 받은 점수를 저장하는 scores 배열
			// scores[0] -> 네임즈"김씨"를 뜻 -> 스캐너로 스코어70 입력하여 점수 저장
		}
		
		int min = scores[0]; //비교할 배열은 점수, 점수 값으로 최대, 최소, 평균 점수 내야 함
		int max = scores[0];
		int sum = 0;	// 평균 점수 얻기 위해 합계가 필요하여 합계 변수 선언 및 초기화 함
		double avg = 0; //값을 대입할 용도여서 0넣음
		int maxIdx = 0;
		int minIdx = 0;
		
		// 연산 및 출력 for문
		for(int i=0; i<scores.length; i++) {
			//최소
			if(min > scores[i]) {
				min = scores[i];
				minIdx = i;	// 인덱스 i번째 중 가장 점수 최소값 저장하여 아래 출력 창에 names배열의 i번째 인덱스, 이름을 출력할 수 있게 됨 
			}
			//최대
			if(max < scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
		
			//합계
			sum += scores[i]; // 0 = 0 + 첫 번째 인덱스의 점수 -> sum 값에 대입이 되고.. 이런 식으로 scores[0] 값 부터 합계에 저장
		}
		
		// System.out.println("스코어길이:" + scores.length);	// 5가 출력
		
		//평균
		avg = (double)sum/scores.length;	// 평균 = 합계 / 5 (비교할 5개의 점수)
		
		System.out.println("가장 낮은 점수 : " + min + ", 학생 : " + names[minIdx]);
		System.out.println("가장 높은 점수 : " + max + ", 학생 : " + names[maxIdx]);
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
