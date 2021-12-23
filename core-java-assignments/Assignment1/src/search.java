import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int[] a={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int i,key;
		boolean found=false;
		System.out.println("Enter the number to be searched: ");
		key=sc.nextInt();
		for(i=0;i<15;i++)
		{
			if(a[i]==key)
			{
				found=true;
				System.out.println(key + " is found in the array");
				break;
			}
		}
		if(found==false)
		{
			System.out.println(key + " is not found in the array");
		}
	}

	}


