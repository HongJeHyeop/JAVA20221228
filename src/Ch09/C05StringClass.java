package Ch09;



public class C05StringClass {
	public static void main(String[] args) {
		String str1 = "jaba";
		String str2 = "jaba";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println("str1 = str2 : " + (str1 == str2));
		System.out.println("str3 = str4 : " + (str3 == str4));
		System.out.println("str1 = str3 : " + (str1 == str3));
		System.out.println("str1 = str4 : " + (str1 == str4));
		
		System.out.println("----------------");
		System.out.println("str1 = str2 : " + (str1.equals(str2)));
		System.out.println("str3 = str4 : " + (str3.equals(str4)));
		System.out.println("str1 = str3 : " + (str1.equals(str3)));
		System.out.println("str1 = str4 : " + (str1.equals(str4)));
		
		
	}
	
}
