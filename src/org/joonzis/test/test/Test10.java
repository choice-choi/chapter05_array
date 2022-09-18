package org.joonzis.test.test;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] eClass = new int[5][];
		
		// 입력
		for(int i=0; i<eClass.length; i++) {
			System.out.print((i+1) + "행 >> ");
			int row = sc.nextInt();
			eClass[i] = new int[row];
			
			for(int j=0; j<eClass[i].length; j++) {
				eClass[i][j] = 1;
			}
		}
		
		// 출력
		for(int i=0; i<eClass.length; i++) {
			for(int j=0; j<eClass[i].length; j++) {
				System.out.print(eClass[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
