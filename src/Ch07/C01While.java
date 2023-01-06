package Ch07;

import java.util.Scanner;

public class C01While {
	public static void main(String[] args) {

		// 기본 while
//		int i = 0; // 탈출용 변수 
//		while(i < 10)// 조건식 
//		{
//			System.out.println("HELLO WORLD");
//			i++;// 조건식이 거짓이 되게끔 하기 위한 연산
//		}

		// 1부터 10까지의 합 구하기
//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//			System.out.println("i 값 :" + i);
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 10까지 합 : " + sum);

		// 1부터 N까지(키보드로부터 입력) 수의 합
		// N부터 M까지의 합(N, M은 키보드로부터 입력)
		// N부터 M까지의 합(N, M은 키보드로부터 입력), 조건 N > M
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		System.out.print("1번 문제 N값 : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		while (i <= n) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1 ~ N까지의 합 : " + sum);
//
//		System.out.print("2번 문제 N, M값 : ");
//		n = sc.nextInt();
//		int m = sc.nextInt();
//		sum = 0;
//		if (n > m) {
//			while (n >= m) {
//				sum += m;
//				m++;
//			}
//			System.out.println("N ~ M까지의 합 : " + sum);
//		} else {
//			System.out.println("N이 M보다 작다");
//		}
//		
		// [답안]
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int n = sc.nextInt();
//		int sum = 0;
//		while (i <= n) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("1부터  %d까지 합 : %d", n, sum);
		
		/** Swap을 사용한 while **/
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); // 초기값
//		int m = sc.nextInt(); // 마지막값
//		
//		if(n>m) {
//			// Swap
//			int tmp = n;
//			n = m;
//			m = tmp;
//			
//		}
//
//		int i = n;
//		int sum = 0;
//		
//		while (i <= m) {
//			System.out.println("n값 : " + i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터  %d까지 합 : %d", n, m, sum);
		
		// 구구단(2단)
//		int dan = 2;
//		int i = 1;
//		while(i <= 9) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//			i++;
//		}
		
		// 구구단(N단)
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int i = 1;
//		while(i <= 9) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			i++;
//		}
		
		// 1부터 10까지 수중에 4의 배수만 출력
//		int i = 1;
//		while(i <= 10) {
//			if(i%4 == 0) System.out.println("i 값 :" + i);
//			i++;
//		}
		
		
		// 1부터 N까지 수중에 4의 배수만 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while(i <= n) {
//			if(i%4 == 0) System.out.println("4의 배수는 :" + i);
//			i++;
//		}
		
		
		// 1부터 10까지 수중에 3의 배수의 합만 출력
//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//			if(i%3 == 0) {
//				System.out.println("3의 배수는 : " + i);
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("3의 배수의 합은 :" + sum);
		
		// 1부터 N까지 수중에 3의 배수의 합만 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i <= n) {
//			if(i%3 == 0) {
//				sum += i;
//				System.out.println("3의 배수는 : " + i);
//			}
//			i++;
//		}
//		System.out.println("3의 배수의 합은 :" + sum);
		
		
		
		
		
		
	}
}
