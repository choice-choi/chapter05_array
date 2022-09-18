package org.joonzis.test.test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
//		Test09.java
//		Q. 과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성.
//			무한반복을 하다가 "그만"을 입력 받으면, 프로그램 종료
//		★	String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
//			int[] scoreArr = 		{95,		88,	 	78, 	  62,		55};
//		실행 예)
//		Java의 점수는 : 95
		
		/*
		 * 1. 스캐너를 이용하여 과목 이름 입력
		 * 2. 무한 루프 작성
		 * 3. 무한 루프 내에서 값 비교
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
		int[] scoreArr = {95, 88, 78, 62, 55};
		
		while(true) {
			System.out.print("과목명 입력 >> ");
			String subName = sc.next();	// 그만
			
			for(int i=0; i<subjectArr.length; i++) {
				if(subName.equalsIgnoreCase(subjectArr[i])) {
					System.out.println(subjectArr[i] + "의 점수는 : " + scoreArr[i]);
				}
			}
			
			if(subName.equals("그만")) {
				break;
			}
		}
		
	}
}
