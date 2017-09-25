import java.util.Scanner;

public class LinearSearch {
	
	public void linearSearch()
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		
		System.out.println("Please enter the length of array: ");
		int length=sc.nextInt();
		System.out.println("Please enter the array of length "+length+" consisting of 0's and 1's : ");
		
		int[] testArray=new int[length];

		for(int i=0;i<length;i++)
		{
	
		testArray[i]=sc.nextInt();
	
		}	
		
		System.out.println("User has entered :");
		for(int j=0;j<testArray.length;j++)
		{
			System.out.print(testArray[j]+" ");
			
		}
		System.out.println("");
		System.out.println("Please enter the number to be searched: ");
		int searchNum=sc.nextInt();
		 for(int i=0;i<testArray.length;i++)
		 {
			 if(testArray[i]==searchNum)
			 {
				 System.out.println("Success!!! The number is found and its on "+i+" index position");
				 flag=true;
				 
			 }
			
		 }
		 if(flag==false)
		 {
			 System.out.println("Sorry!!! The number is not found in the given array");
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearch ob1= new LinearSearch();
		ob1.linearSearch();

	}

}
