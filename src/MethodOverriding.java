
 class MethodOverriding {
	
	public void test()
	{
		
		System.out.println("Test method of MethodOverrriding class");
	}
	
public static void main(String[] args) {
		
		MethodOverriding ob1=new MethodOverriding();
		
		Bi ob2=new Bi();
		
		ob1.test();
		ob2.test();

	}

	
 }
	class Bi extends MethodOverriding{
		
		public void test() {
			
			System.out.println("Method Overridding of Class B");
		}
		
	
	}
	

