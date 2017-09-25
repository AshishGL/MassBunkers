class Bike{
   void run(){System.out.println("running");}
   public static void main(String args[]){
	     Bike b= new Splender();//upcasting
	     b.run();
	   }
  
 }
 class Splender extends Bike{  void run(){System.out.println("running safely with 60km");}
 
   
 }
