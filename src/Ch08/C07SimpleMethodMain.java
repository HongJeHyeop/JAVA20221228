package Ch08;

import java.util.Scanner;

class Sum {
	// 속성
	Scanner sc = new Scanner(System.in);
	// 기능

	// 1. 인자 o, return o
	int sum1(int x, int y) {
		return x + y;
	}
	
	// 2. 인자 o, return x
	void sum2(int x, int y) {
		System.out.println("SUM2(x, y) : " + (x + y));
	}
	
	// 3. 인자 x, return o
	int sum3() {
		System.out.print("SUM3(x,y) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}
	
	// 4. 인자 x, return x
	void sum4() {
		System.out.print("a, b, c : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("a + b + c : " + (a + b + c));
	}

}

public class C07SimpleMethodMain {

	public static void main(String[] args) {

		Sum calc = new Sum();
		
		// 1.
		int r1 = calc.sum1(10, 20);
		System.out.println("R1 : " + r1);
		
		// 2.
		calc.sum2(10, 20);
		
		// 3.
		int r3 = calc.sum3();
		System.out.println("R3 : " + r3);
		
		// 4.
		calc.sum4(); // sc로 세수를 입력받아 세수의 합이 console 출력
		
	}
}
