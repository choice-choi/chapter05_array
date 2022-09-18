package org.joonzis.test;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
//		Test09.java
//		Q. 과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성.
//			무한반복을 하다가 "그만"을 입력 받으면, 프로그램 종료
//		★	String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
//			int[] scoreArr = {95, 88, 78, 62, 55};
//		실행 예)
//		Java의 점수는 : 95
//				
//		>>위 식 그대로 이용하여 위 식 안에서 뽑아내어 반복문 사용하여 i값 인덱스 번호갖고 아래 식 활용하여 출력		
			
		String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
		int[] scoreArr = {95, 88, 78, 62, 55};
		
		//인덱스 공유한단건 for문을 쓰건..
		//입력받기위한 스캐너 사용
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목명 입력 >> ");
			String subName = sc.next();	//과목명 JSP라고 예시할 예정??
			
			if(subName.equals("그만")) {
				break;
			}
			
			//모든 인덱스 다 봐야해서, 접근해야해서 for문 사용
			for(int i=0; i<subjectArr.length; i++) {
				if(subjectArr[i].equalsIgnoreCase(subName)) {
					System.out.println(subjectArr[i] + "의 점수는 : " + scoreArr[i]);
				}
			}
			
			
		}
		
		

	}

}
