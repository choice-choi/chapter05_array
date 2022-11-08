package org.joonzis.test.test;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. Test02.java 의 배열 값들을 모두 더하고, 총점과 평균을 출력
		
		int[] arr = {10, 20, 50, 60, 13, 25, 97};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];	
			// 0인 sum의 값에 배열 첫 번째인 10을 더한 값이 sum의 값이 될 수 있게 하는 코드
//			sum = sum + arr[i];
		}
		System.out.println("배열의 총 합 : " + sum);
		
		double avg = (double)sum/arr.length;
//		double avg = sum/arr.length;
		
		System.out.println("평균 : " + avg);
		
		
	} // method end
}// class end
