package Ch09;

class Person { // 사람 클래스
	void breath() {
		System.out.println("숨쉬기");
	}

	void eat() {
		System.out.println("밥먹기");
	}

	void say() {
		System.out.println("말하기");
	}

}

class Student1 extends Person {
	void learn() {
		System.out.println("배우기");
	}
	
}

class Teacher extends Person {
	void teach() {
		System.out.println("가르치기");
	}
}
public class PersonEx {
	public static void main(String[] args) {
		System.out.println("student");
		Student1 s1 = new Student1();// 학생 인스턴스 s1 생성
		s1.breath(); // 사람 클래스의 breath 메서드를 상속 받았음
		s1.learn();
		s1.say();

		System.out.println("teacher");
		Teacher t1 = new Teacher(); // 선생 인스턴스 t1 생성
		t1.eat(); // 사람 클래스의 eat 메서드를 상속 받았음
		t1.teach();
		t1.say();
		
		System.out.println("person");
		Person person = new Person();
		person.breath();
		// person.learn(); // 자식 클래스의 메서드나 멤버 변수는 사용하지 못함.

	}
}
