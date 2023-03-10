package Ch09;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!"); // 보통의 학생
	}
	
}

class Leader extends Student2 {
	
	void lead() {
	}

	// 오버라이딩은 자손 클래스에서 부모 클래스로부터 물려받은 메서드를 다시 작성하는 것 
	@Override
	void say() {
		System.out.println("선생님께 인사"); // 오버라이딩
		super.say();
	}
	
}


public class Overriding {
	
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat(); // 상속받은 메서드 사용
		leader.say(); // 오버라이딩한 메서드 사용
	}

}
