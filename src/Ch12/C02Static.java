package Ch12;

class C02Simple {
	int n1;
	static int n2;
	
	void Func1() {
		n1 = 10;
		n2 = 20;
	}
	static void Func2() {
		// n1 = 10; //문제발생 : static은 class영역에 미리 만들어져야하는데 n1은 미리 만들어지지 않음
		n2 = 20;
		int num = 10;
	}
}


public class C02Static {
	public static void main(String[] args) {
		
	}
}
