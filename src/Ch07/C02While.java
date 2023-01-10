package Ch07;

import java.util.Scanner;

public class C02While {
	public static void main(String[] args) {
		// 구구단(2단 - 9단)

//		int dan = 2;
//		int i = 1;
//		
//		while(dan <= 9) {
//			i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d : %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 2단 9단 출력
//		9 x 1 = 9 -> 2 x 9 = 18
//		int dan = 9;
//		int i = 1;
//		while(dan >= 2) {
//			i = 1;
//			while(i <=9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}

		// 2단 9단 출력
//		9 x 9 = 81 -> 2 x 1 = 2
//		int dan = 9;
//		int i = 9;
//		while(dan >= 2) {
//			i = 9;
//			while(i >= 1) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// N단을 입력받아 N단부터 9단까지 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while (n <= 9) {
//			i = 1;
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", n, i, n * i);
//				i++;
//			}
//			System.out.println();
//			n++;
//		}

		// N, M을 입력받아 N부터 M단까지 출력(N<M and N<8, M,=9)
//		Scanner sc = new Scanner(System.in);
		
		// 1
		// *****
		// *****
		// *****
		// *****
		
//		int i = 0;
//		int j = 0;
//		while(i < 4) {
//			j=0;
//			while(j < 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		// 2
		// *
		// **
		// ***
		// ****
//		int i = 0;
//		int j = 0;
//		while(i < 4) {
//			j=0;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 만큼의 직각삼각형 별이 출력되도록 합니다.
		// 높이 입력 : 3
		// *
		// **
		// ***
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i < h) {
//			j = 0;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// 3
		// ****
		// ***
		// **
		// *
//		int i = 0;
//		int j = 0;
//		while(i < 4) {
//			j = 0;
//			while(j < 4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 : 3(입력)
		// ***
		// **
		// *
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i < n) {
//			j = 0;
//			while(j < n-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		// 4
		//    * 
		//   ***
		//  *****
		// *******
//		int i = 0; // 개행
//		int j = 0; // 공백
//		int k = 0; // 별
//		while(i < 4) {
//			j = 0; 
//			while(j <= 2 - i) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 입력해서 받는 작업
//		Scanner sc = new Scanner(System.in);
//		int i = 0; // 개행
//		int j = 0; // 공백
//		int s = 0; // 별
//		int h = sc.nextInt(); // 높이
//		
//		while(i < h) {
//			j = 0;
//			while(j <= (h-2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			s = 0;
//			while(s <= i*2) {
//				System.out.print("*");
//				s++;
//			}
//			System.out.println();
//			i++;
//		}
//		[규칙]
//		i(개행)		j(공백)		s(별)
//		0			0-(h-2)-0	0-0
//		1			0-(h-2)-1	0-2
//		2			0-(h-2)-2	0-4
//		3			0-(h-2)-3	0-6
//		---------------------------------
//		i = 0;	    j = 0;		s = 0;
//		i < h	  j <= (h-2)-i  s <= i*2
//		i++;		j++;		s++;
//		---------------------------------
		
		// 5
		// *******
		//  *****
		//   ***
		//    *
//		int i = 0; // 개행
//		int j = 0; // 공백
//		int s = 0; // 별
//		
//		while(i < 4) {
//			j = 0;
//			while(j<= i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			s = 0;
//			while(s <= (3 - i) * 2 ) {
//				System.out.print("*");
//				s++;
//			}
//			System.out.println();
//			i++;
//		}
//		i(개행)		j(공백)		s(별)
//		0			x			0-6
//		1			0-1			0-4
//		2			0-2			0-2
//		3			0-3			0-0
//		---------------------------------
//		i = 0;	    j = 0;		s = 0;
//		j<= i-1	   j<= i-1  s <= (3 - i) * 2
//		i++;		j++;		s++;
//		---------------------------------
		
		
		// 입력받은 역삼각형
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i = 0; // 개행
		int j = 0; // 공백
		int s = 0; // 별
		
		while(i < h) {
			j = 0;
			while(j<= i-1) {
				System.out.print(" ");
				j++;
			}
			s = 0;
			while(s <= ((h-1) - i) * 2 ) {
				System.out.print("*");
				s++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
	}
}
