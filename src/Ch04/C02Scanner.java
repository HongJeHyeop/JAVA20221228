package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    // ctr1 + shift + o (자동Import지정)
		
//		System.out.print("정수 입력: ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
//		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();          // 문자열 입력받기 기능 함수, 띄어쓰기는 포함하지 않는다.
//		System.out.println("입력된 문자열 : " + str1);
		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.nextLine();          
//		System.out.println("입력된 문자열 : " + str1);
// --------------------------------------------------------------------------------------
//		주의 nextLine() 함수 사용시 주의할 점
//		nextInt(), nextDouble(), next() 함수 사용 이후에 
//		nextLine()함수를 사용해서 문자열을 받는 경우
//		sc.nextLine()을 한번 더 사용해서 읽어 들이는 버퍼라인을 초기화한다.
		
		System.out.print("정수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		
		// 이전에 nextInt를 받아오면서 버퍼에 저장된 \n이 남아있기때문에 nextLine을 한번 사용해서  \n을 버린다.
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();          
		System.out.println("입력된 문자열 : " + str1);
		
		sc.close();
	}
}
