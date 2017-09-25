import java.util.Scanner;

public class BinarySort {
	
	public void binarySort() {
		
		Scanner sc=new Scanner(System.in);
		int zeroCount=0;
		int oneCount=0;
		
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
		System.out.println("Array after sorting 0's and 1's");
		
		for(int k=0;k<testArray.length;k++)
		{
			if(testArray[k]==0)
			{
				zeroCount++;
			}
			else
			{
				oneCount++;
			}
		}
		
		for(int i=0;i<zeroCount;i++)
		{
			System.out.print("0 ");
		}
		for(int i=0;i<oneCount;i++)
		{
			System.out.print("1 ");
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySort ob1=new BinarySort();
		ob1.binarySort();
		

	}

}
