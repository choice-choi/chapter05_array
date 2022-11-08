package org.joonzis.test.test;

public class Test03_1 {
	public static void main(String[] args) {
//		Test03.java
//		Q. Test02.java 의 배열 값들을 모두 더하고, 총점과 평균을 출력
		
		int[] arr = {10, 20, 50, 60, 13, 25, 97};

		int sum = 0;
		int avg = sum / arr.length;
		
		for(int i=0; i<=arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("배열의 총점" + sum);
		System.out.println("배열의 평균" + avg);
		
		
	} // method end
}// class end
