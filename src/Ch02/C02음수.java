package Ch02;

public class C02음수 {

	public static void main(String[] args) {
		// 컴퓨터(CPU)는 가산회로에 의한 가산처리가 가능하다? O
		// 컴퓨터(CPU)는 감산회로에 의한 감산처리가 가능하다? X
		// 컴퓨터(CPU)는 보수개념을 이용하여 뺄셈결과를 전달할 수 있다. O
		
//		9 - 3 = 6
//		9 + (7) = 16
//		
//		75 - 22 = 53
//		75 + (78) = (1)53
//		
//		00000101  = 5
//		11111010  = -6 (1의 보수)
//		       1  
//	  + 11111011  = -5 (2의 보수)
//		--------------
//		          = 0
//		MSB(부호비트) : 가장 왼쪽 1bit를 양수 혹은 음수로 판단하는 bit로 사용
//					 저장공간(변수공간)에서 부호비트를 지원하면(Signed)
//					 1 : 음수값, 0 : 양수값으로 해석
//					 저장공간(변수공간)에서 부호비트를 지원하지 않으면(Unsigned)
//					 0,1 : 양수
		
		//문제
		//10진수	-> 2진수
		//10	->	00001010
		//-10	->	11110110	
		System.out.println((byte)(0b10100000));
		//111	->  01101111
		//-111	->  10010001
		//96	->  01100000
		//-96	->  10100000
		
		
		//2진수	-> 10진수
		//10101010 	-> -128 + 32 + 8 + 2 = -86   
		//11001101	-> -128 + 64 + 8 + 4 + 1 = -60
		//10010010	-> -128 + 16 + 2 = -110

	}

}
