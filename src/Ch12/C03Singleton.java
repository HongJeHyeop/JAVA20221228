package Ch12;

class C03Company {
	//디자인 패턴

	//상품 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴
	//디자인 패턴은 제작자들간의 의사소통 수단의 일종이다
	//ex) 의류를 디자인을 할때 일반적으로 알려진 패턴대로 재단을 한다(~소재는 미싱은 어떻게어떻게해야~잘뜯어지지않는다)
	//ex) 그렇게 하지 않을때 품질에 이상발생 가능성 높다 

	//프로그래밍언어의 디자인 패턴
	//프로그램 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴 	
	
	
	int x;
	int y;
	
	private static C03Company instance;
	
	//생성자
	private C03Company() {}
	
	// 멤버함수
	public static C03Company getInstance() {
		if(instance == null) {
			instance = new C03Company();
		}
		return instance;
	}
	
}

public class C03Singleton {
	public static void main(String[] args) {
		// C03Company myCompany0 = new C03Company(); // 불가능
		C03Company myCompany1 = C03Company.getInstance();
		C03Company myCompany2 = C03Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
		myCompany1.x = 10;
		myCompany2.y = 20;
		C03Company myCompany3 = C03Company.getInstance();
		System.out.println(myCompany3.x + " " + myCompany3.y);
	}
}
