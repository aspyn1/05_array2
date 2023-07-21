package edu.kh.array2.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Example {
	
	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념이 추가된 것
	 */
	
	// 2차원 배열 및 선언
	public void ex1() {
		
		// 2차원 배열 선언
		int[][] arr; 
		// int 2차원 배열을 참조하는 참조변수 선언
		// 참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스
		
		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기]
		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		
		// 2차원 배열 초기화
		// 1) 행, 열 인덱스를 이용해서 직접 초기화
		/*
		arr [0][0] = 10;
		arr [0][1] = 20;
		arr [0][2] = 30;
		
		arr [1][0] = 40;
		arr [1][1] = 50;
		arr [1][2] = 60;
		*/
		
		// 2) 2중 for문을 이용한 초기화
		int num = 10; // 배열 요소 초기화에 사용할 변수
		
		// * 배열 길이
		// -> 배열명.length는 변수가 직접 참조하고있는 배열의 길이를 반환
		
		System.out.println(arr.length); // 2 (행길이)
		// arr이 참조하고있는 2차원 배열의 행의 길이이다.
		System.out.println(arr[0].length); // 3 (열길이)
		// arr의 0번째 인덱스 행이 참조하고있는 1차원 배열의 열의 길이이다.
		System.out.println(arr[1].length); // 3 (열길이)
		// arr의 1번째 인덱스 행이 참조하고있는 1차원 배열의 열의 길이이다.

		for(int row = 0; row < arr.length; row++) { // 행 반복 (0, 1)
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = num;
				num += 10;
			}
		}
		
		// Arrays.toString(배열명) : 참조하고있는 1차원 배열 값을 문자열로 변환
		System.out.println(Arrays.toString(arr));
		
		// Arrays.deepToString(배열명) : 
		// 참조하고있는 모든 배열의 데이터가 나오는 부분까지 파고들어가서 모든 값을 문자열로 변환
		System.out.println(Arrays.deepToString(arr));
		
		// 3) 
		
	}

	// 2차원 배열 선언과 동시에 초기화
	public void ex2() {
		// 3행 3열짜리 정수형 2차원배열 선언/초기화(1~9) 동시
		
		int[][] arr = {{1, 2, 3}, 
				   	   {4, 5, 6}, 
					   {7, 8, 9}};
		
		
		// 행 별로 합 출력
		
		for(int row = 0; row < arr.length; row++) {
			int sum = 0;
			
			for(int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
			
			System.out.println(row + "행의 합 : " + sum);
		}
		
		System.out.println("========================");
		
		// 열 별로 합 출력
		// 0열의 합 : 12
		// 1열의 합 : 15
		// 2열의 합 : 18
		
		for(int col = 0; col < arr[0].length; col++) {
			int sum = 0;
			
			for(int row = 0; row < arr.length; row++) {
				sum += arr[row][col];
			}
			
			System.out.println(col + "열의 합 : " + sum);
		}
		
		System.out.println("========================");

		// 전체 합 출력
		// 전체 합 : 45
		int total = 0;
		for(int row = 0; row < arr.length; row++) {
			
			
			for(int col = 0; col < arr[row].length; col++) {
				
				total += arr[row][col];
			}
		}
		
		System.out.println("전체 합 : " + total);
	}

	// 가변 배열
	public void ex3() {
		/* 가변 배열
		 * - 2차원 배열 생성 시 마지막 배열 차수(열)을 지정하지않고
		 * 나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		 */
		
		char[][] arr = new char[4][]; // char 2차원배열 생성 시 행부분만 생성

		arr[0] = new char[3]; // 0행에 3열짜리 1차원 배열을 생성하여 주소값 저장
		arr[1] = new char[4]; // 1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
		arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열을 생성하여 주소값 저장
		arr[3] = new char[2]; // 3행에 2열짜리 1차원 배열을 생성하여 주소값 저장
		
		char ch = 'a';
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = ch++;
			}
		}

		System.out.println(Arrays.deepToString(arr));
	}	

	public void ex4() {

		
		Scanner sc = new Scanner(System.in);
		
		int[][] bingo = new int[5][5];
		
		for(int row = 0; row < bingo.length; row++) {
			
			for(int col = 0; col < bingo[row].length; col++) {
				
				int random = (int)(Math.random() * 25 + 1);
				bingo[row][col] = random;
			}

		}
		
		System.out.println(Arrays.deepToString(bingo));
		
			for(int row1 = 0; row1 < bingo.length; row1++) {

				for(int col = 0; col < bingo[row1].length; col++) {
					
					System.out.println("1~25의 숫자를 입력하세요. (종료 : 0) > ");
					int input = sc.nextInt();

					if(input == bingo[row1][col]) {
						bingo[row1][col] = 0;
					}else if(input == 0) {
						break;
					}
				}
			}			
	}

	
}
