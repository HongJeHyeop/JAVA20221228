package Ch10;

import java.util.Scanner;

public class C05Prac {
	public static void main(String[] args) {
		// [문제]1차원 배열
		// 10 크기의 int형 배열을 만들어서
		// 반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력
		// 합,평균,최대값,최소값을 구합시다
//		Scanner sc = new Scanner(System.in);
//		int [] arr = new int[10];
//		int sum = 0;
//		double avg = 0.0;
//		
//		// 배열에 값을 입력받으면서 sum 구하기
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
//		System.out.println("합은 : " + sum);
//		
//		// 평균 구하기
//		avg = (double)sum / arr.length;
//		System.out.println("평균 : " + avg);
//		
//		// 최대값 최소값 초기셋팅
//		int max = arr[0];
//		int min = arr[0];
//		// 최대값 구하기
//		for(int num : arr) {
//			if(num > max) {
//				max = num;
//			}
//		}
//		System.out.println("최대값 : " + max);
//		
//		// 최소값 구하기
//		for(int num : arr) {
//			if(num < min) {
//				min = num;
//			}
//		}
//		System.out.println("최소값 : " + min);

		// [문제]2차원 배열
		// 문제
		// 5명의 학생의 국/영/수 점수를 입력받아 출력을 해봅시다
		// 학생별 평균 구하기
		// 과목별 평균 구하기
		// 각 행의 합 과 전체 합 // 각행의 평균 전체 평균을 출력하세요

		// 출력예
		// 1 학생 점수입력(국/영/수 순서) : 100 70 60
		// 2 학생 점수입력(국/영/수 순서) : 99 98 66
		// 3 학생 점수입력(국/영/수 순서) : 99 88 77
		// 4 학생 점수입력(국/영/수 순서) : 100 55 66
		// 5 학생 점수입력(국/영/수 순서) : 55 66 77
		// 1 학생 총점 : ? 평균 ?
		// 2 학생 총점 : ? 평균 ?
		// 3 학생 총점 : ? 평균 ?
		// 4 학생 총점 : ? 평균 ?
		// 5 학생 총점 : ? 평균 ?
		// 국어 총점 : ? 국어 평균 :?
		// 영어 총점 : ? 영어 평균 :?
		// 수학 총점 : ? 수학 평균 :?

		Scanner sc = new Scanner(System.in);
		int[][] student = new int[5][3];
		int sum = 0;
		
		// 점수 입력 부분
		for (int i = 0; i <= student.length; i++) {
			System.out.print((i+1) + "학생 점수입력 : ");
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		System.out.println("------------------");

		// 점수 출력 부분
		for (int i = 0; i < student.length; i++) {
			System.out.print((i + 1) + "번학생 점수 국/영/수 : ");
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------");

		// 총점, 평균 출력 부분
		for (int i = 0; i < student.length; i++) {
			sum = 0;
			for (int j = 0; j < student[i].length; j++) {
				sum += student[i][j];
			}
			System.out.println((i + 1) + "번 학생 총점 : " + sum + ", 평균 : " + (String.format("%.2f", (double) sum / student[i].length)));
		}
		System.out.println("------------------");

		// 과목별 총점, 평균 출력
		int sub_sum = 0;
		for (int i = 0; i < student[i].length; i++) {
			sub_sum = 0;
			for (int k = 0; k < student.length; k++) {
				sub_sum += student[k][i];
			}
			switch (i) {
			case 0:
				System.out.println("국어 총점 : " + sub_sum + ", 평균 : " + (String.format("%.2f",(double) sub_sum / student.length)));
				break;
			case 1:
				System.out.println("영어 총점 : " + sub_sum + ", 평균 : " + (String.format("%.2f",(double) sub_sum / student.length)));
				break;
			case 2:
				System.out.println("수학 총점 : " + sub_sum + ", 평균 : " + (String.format("%.2f",(double) sub_sum / student.length)));
				break;
			}

		}
		System.out.println("------------------");
		
		// 점수의 총합과 총편균
		int all_sum = 0;
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				all_sum += student[i][j];
			}
		}
		System.out.println("전체 성적 총합 : " + all_sum + ", 전체평균 : " + String.format("%.2f", ((double)all_sum / student.length / student[0].length)));
		

	}
}
