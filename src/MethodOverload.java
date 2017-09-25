
public class MethodOverload {
	
	public void test(double b) {
		
		System.out.println("Test Method with no arguments>>>>"+b);
	}

	public void test(int a) {
		
		System.out.println("Test Method with arguments>>> "+ a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverload ob1=new MethodOverload();
		ob1.test(585542255);
		ob1.test(775242855);
		
		
		
		
	}

}
