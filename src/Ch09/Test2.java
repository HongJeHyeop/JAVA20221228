package Ch09;

public class Test2 {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}


class Student {
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (float)this.getTotal() / 3;
	}
	
//	private int total = kor + eng + math;
//	private double average = total / 3;
//	
//	public void setTotal(int total) {
//		this.total = total;
//	}
//	public void setAverage(double average) {
//		this.average = average;
//	}
//	
//	// getter
//	public int getTotal() {
//		return this.total;
//	}
//	public double getAverage() {
//		return this.average;
//	}
	

}