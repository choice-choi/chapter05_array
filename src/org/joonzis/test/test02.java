package org.joonzis.test;

//import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
//		Test02.java
//		Q. 10, 20, 50, 60, 13, 25, 97 의 총 7개의 정수 값을 저장한 배열을 선언 후
//			60의 값이 들어있는 배열의 인덱스를 출력

//		>>이게 60인지 판단하는 식, (이게 60이면~?)
				
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr1 = new int[7];
		int[] arr2 = {10, 20, 50, 60, 13, 25, 97};
		
//		for(int i=0; i<arr2.length; i++) {
//				System.out.println(arr2[3]);
//				arr2[i] = sc.nextInt();
//			}
		
		// 배열의 모든 인덱스에 접근할 시 아래 식은 고정으로 생각하기
		for(int i=0; i<=arr2.length; i++) {
			if(arr2[i] == 60) {
				System.out.println("60의 인덱스 번호 : " + i);	//이 식은("60의 인덱스 번호 : " + i) 문자열 데이터 1개의 값임. println에 들어가야하는 값은 1개
//				arr2[3] = 60;
//				arr2[i] = sc.nextInt();
//			}else {
//				}
		
		}
		}

	}

}
