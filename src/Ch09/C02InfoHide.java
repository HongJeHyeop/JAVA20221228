package Ch09;

// 정보은닉
// 클래스 내의 멤버변수(멤버함수)의 사용을 제한하는 문법

// 접근한정자
// public			: 모든 클래스에서 접근가능
// default(기본값)	: 동일 패키지에 속한 클래스에서만 접근가능
// private			: 현재 클래스 내에서만 접근가능
// protected		: 동일 패키지에 속한 클래스 or 상속관계에서의 하위 클래스에서만 접근가능

class C02Person {
	// 속성
	private String name;	// 이름
	private String id;		// 주민번호
	private int age;		// 나이
	private float weight;	// 몸무게
	private double height;	// 키
	private int salary;		// 급여정보
	
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}

public class C02InfoHide {
	public static void main(String[] args) {
		C02Person obj = new C02Person();
		
	}
}
