
package Ch05;

public class C01연산자 {
	public static void main(String[] args) {
		
		// 산술 연산자 ( + - * / % )
//		int a = 10, b = 20, c;
//		System.out.println("a+b=" + (a + b));
//		System.out.println("a-b=" + (a - b));
//		System.out.println("a*b=" + (a * b));
//		System.out.println("a/b=" + (a / b)); // 나누기 - 몫
//		System.out.println("a%b=" + (a % b)); // 나누기 - 나머지(1. 짝홀수구분, 2.배수구분, 3.자리수제한, 4.끝자리구하기)
//		System.out.println("-a=" + -a);
		
		
		// 대입 연산자 : 공간 = 값(우선처리)
		// 문제 : 두 정수를 입력받아 두수의 합 / 곱 / 차를 출력하는 프로그램을 만듭니다. (Scanner사용)
				
// -----------------------------------------------------------------------------------------------
		
		// 복합 대입 연산자
//		int a = 10;
//		a += 10; // a = a + 10;
//		a -= 5;  // a = a - 5;
//		a *= 3;  // a = a * 3;
//		a /= 3;  // a = a / 3;
//		a &= 2;  // a = a % 2;
//		System.out.println("a=" + a);
		
// -----------------------------------------------------------------------------------------------
		
		// 비교 연산자 (중요!) : >, >=, <, <=, ==, != (true, false)
//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : " + (a == b));  // a=b와 혼동하지 말것 (a=b는 대입연산)
//		System.out.println("A >  B : " + (a > b));
//		System.out.println("A <  B : " + (a < b));
//		System.out.println("A >= B : " + (a >= b));
//		System.out.println("A <= B : " + (a <= b));
//		System.out.println("A != B : " + (a != b));
		
// -----------------------------------------------------------------------------------------------
	
		// 논리 연산자 (중요!) : and(&&), or(||), !(부정)
		// &&(and연산)  : 모든 조건식이 true여야지만 true를 반환
		// ||(or연산)   : 조건식 중 하나라도 true이면 ture를 반환
		// !(논리부정연산) : true라면 false반환, false라면 true반환
//		System.out.println("true AND true = " + (true && true));
//		System.out.println("false AND true = " + (false && true));
//		System.out.println("true AND false = " + (true && false));
//		System.out.println("false AND false= " + (false && false));
//		
//		
//		System.out.println("true AND true = " + ((10 > 5) && (6 > 4)));
//		System.out.println("false AND true = " + (false && true));
//		System.out.println("true AND false = " + (true && false));
//		System.out.println("false AND false= " + (false && false));

//		System.out.println("true  or true = " + (true || true));
//		System.out.println("false or true = " + (false || true));
//		System.out.println("true  or false = " + (true || false));
//		System.out.println("false or false = " + (false || false));
		
//		boolean flag = true;
//		System.out.println("flag : " + flag);
//		System.out.println("!flag : " + !flag);
		
// -----------------------------------------------------------------------------------------------
		
		// 증감 연산자 
		// ++a(--a) : 전치 연산자 : 먼저 값 1증가(1감소) 이후 다른 연산자 처리		
		// a++(a--) : 후치 연산자 : 다른 연산자 처리 먼저 한 후 1증가(1감소)
//		int a = 10, b = 10, c, d;
//		
//		c = --a + b--;
//		d = a-- + --b;
//		System.out.printf("a=%d, b=%d, c=%d, d=%d", a, b, c, d);
		
// -----------------------------------------------------------------------------------------------
		
		// 삼항 연산자 
		// (조건식) ? 참인경우 실행코드 : 거진인경우 실행코드;
		
//		int score = 85;
		int kor = 85;
		int eng = 60;
		char grade = (kor>80 && eng>80) ? 'A' : 'B';
		System.out.println(grade + "등급입니다.");
		
	}
}
