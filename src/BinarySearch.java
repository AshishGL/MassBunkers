import java.util.Scanner;

public class BinarySearch {
	
	public void binarySearch()
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		
		System.out.println("Please enter the length of array: ");
		int length=sc.nextInt();
		System.out.println("Please enter the array of in sorted manner");
		
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
		 
		int beg=0, mid,end;
		end=testArray.length;
		mid=(beg+end)/2;
		
		while(beg==end)
		{
		
		if(searchNum<=testArray[mid])
		{
			System.out.println("Number Found!!!! at "+mid+" position");
			flag=true;
			break;
		}
	
		else if(searchNum<testArray[mid])
		{
			end=mid;
			mid=(beg+end)/2;
			
			
		}
		
		else if(searchNum>testArray[mid])
		{
			beg=end;
			mid=(beg+end)/2;
		}
		}
		if(flag==false)
		{
			System.out.println("Searched Number is not in array");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinarySearch ob1=new BinarySearch();
		ob1.binarySearch();
		
	}

}
