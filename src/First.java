
class First {
	
	public void run() {
		
		System.out.println("Ride Bike");
	}
	public static void main(String[] args)
	{
		First ob=new Second();
		ob.run();
		
	}
	
		
}

class Second extends First{

	public void run() {
		
		System.out.println("Ride Bike below 60kmph");
	}

	
}
