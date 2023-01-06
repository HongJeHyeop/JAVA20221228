package Ch06;

import java.util.Scanner;

public class C01IF문 {

	public static void main(String[] args) {
		
		// 01 단순 IF
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >= 8) {
//			System.out.println("학교에 다닙니다.");
//		}
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age < 8) {
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
		
		
		// 02 IF-ELSE
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >= 8) {
//			System.out.println("학교에다닙니다.");
//		}else {
//			System.out.println("학교에 다니지 않습니다.");
//		}
		
		
		// 정수 하나를 받아 입력받은 수가 짝수인지 홀수인지 확인
		// 정수 하나를 받아 입력받은 수가 3의 배수인지 아닌지 확인
		// 두 수를 입력받아 큰수를 출력
		// 세 수를 입력받아 큰수를 출력 (&&연산자 사용)
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
//		
//		int b = sc.nextInt();
//		if(b % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}else {
//			System.out.println("3의 배수가 아닙니다.");
//		}
//		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		if(n1 > n2) {
//			System.out.println("큰 수는 : " + n1);
//		}else {
//			System.out.println("큰 수는 : " + n2);
//		}
		
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		
		if(n3 > n4 && n3 > n5) {
			System.out.println("가장 큰 수는 : " + n3);
		}else if (n4 > n3 && n4 > n5) {
			System.out.println("가장 큰 수는 : " + n4);
		}else {
			System.out.println("가장 큰 수는 : " + n5);
		}
		
		
		
		
		
		
		
		
	}

}
