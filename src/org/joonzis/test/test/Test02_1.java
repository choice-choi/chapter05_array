package org.joonzis.test.test;

public class Test02_1 {
	public static void main(String[] args) {
//		Test02.java
//		1) Q. 10, 20, 50, 60, 13, 25, 97 의 총 7개의 정수 값을 저장한 배열을 선언 후
//		2)	60의 값이 들어있는 배열의 
//		인덱스를 출력
		
		int[] arr = {10,20,50,60,13,25,97};
		System.out.println(arr[3]);
		
		for(int i=0; i<=arr.length; i++) {
			if(arr[i]==60) {
				System.out.println("60의 인덱스 번호 : " + i);
			}
		}
	}
}
