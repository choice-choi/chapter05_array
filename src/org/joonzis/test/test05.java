package org.joonzis.test;

import java.util.Arrays;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
//		Test05. java
//		Q. int[] arr = {13, 22, -3, 92, 55, 5}
//			배열에서 값을 바꾸고 싶은 인덱스 2개를 선택하여
//			서로 값을 바꾸어 값들을 출력
//			
//		>>문제 쪼개어 출력, 바꿀 인덱스 값 입력하여 바꾸어 값 출력	
//		>>1) index 2개 선택(=입력)
//		>>2) 값 서로 변경
//		>>3) 출력

//		나의 오답
//		int[] arr2 = {13, 22, -3, 92, 55, 5};
//		
//		if(arr2 = 13 && arr2 = 5) {
//			System.out.println(arr2 +=  );
//		}else if(arr2 = 5 && arr2 = 13) {
//			System.out.println(arr2 -=  );
//		}else {
//			System.out.println(arr2);
//		}
		
		
//		double c = 100;
//		double f = c * 1.8 + 32;	//화씨
//		System.out.println("변환된 화씨 : " + f);
//		
//		//섭씨 = (화씨 -32) / 1.8
//		double c = (f - 32) / 1.8;  // 위 공식과 반대로 하면 됨 정답아니니까 다시 풀기
//		double f = 100					//
//		System.out.println("변환된 섭씨 : " + f);
		
//		답>> 1, 3번 인덱스 받을 경우
		int[] arr = {13, 22, -3, 92, 55, 5};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 첫 번째 인덱스 >> ");
		int idx1 = sc.nextInt();
		System.out.print("변경할 두 번째 인덱스 >> ");
		int idx2 = sc.nextInt();
		
		
		int temp = 0; // 임시 변수
		
		System.out.println("변경 전 데이터 : " + Arrays.toString(arr));
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.println("변경 후 데이터 : " + Arrays.toString(arr));
		
		

	}

}
