package Ch02;

public class C01진수 {

	public static void main(String[] args) {
//		10진수		2진수
//		0		   0
//		1		   1
//		2		  10
//		3		  11
//		4		 100
//		5		 101
//		6		 110
//		7		 111
//		8		1000
//		9		1001
//
//		1bit	2^1 = 2(0~1)
//		2bit	2^2 = 4(0~3)
//		3bit	2^3 = 8(0~7)
//		4bit	2^4 = 16(0~15)
//		5bit	2^5 = 32(0~31)
//		6bit	2^6 = 64(0~63)
//		7bit	2^8 = 128
//		8bit	2^8 = 256

		// 문제
		// 2진수 -> 10진수
		// 01100010 -> 98
		// 01010001 -> 81
		// 01100110 -> 102

		// 문제
		// 10진수 ->2진수
		// 31 -> 00011111
		// 25 -> 00011001

		// 진법변환 서식문자
		// %d : 10진정수 서식문자
		// %o : 8진수 서식문자
		// %x : 16진수 서식문자

		System.out.printf("10진수 : %d\n", 0b1111); // 2진수 (0b : 2진수를 의미하는 접두사
		System.out.printf("10진수 : %d\n", 173); // 10진수
		System.out.printf("10진수 : %d\n", 0255); // 8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 0xAD); // 16진수(0x : 16진수를 의미하는 접두사)

		System.out.printf("8진수 : %o\n", 0b1111); // 2진수 (0b : 2진수를 의미하는 접두사
		System.out.printf("8진수 : %o\n", 173); // 10진수
		System.out.printf("8진수 : %o\n", 0255); // 8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n", 0xAD); // 16진수(0x : 16진수를 의미하는 접두사)

		System.out.printf("16진수 : %x\n", 0b1111); // 2진수 (0b : 2진수를 의미하는 접두사
		System.out.printf("16진수 : %x\n", 173); // 10진수
		System.out.printf("16진수 : %x\n", 0255); // 8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("16진수 : %x\n", 0xAD); // 16진수(0x : 16진수를 의미하는 접두사)

	}

}
