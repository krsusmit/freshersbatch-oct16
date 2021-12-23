import java.util.Scanner;

public class armstrong {

		// TODO Auto-generated method stub
		
		static void armstrong(int a)
		{
			int count=0,rem=0,temp=a;
			double b=0.0;
			while(temp!=0)
			{
				temp=temp/10;
				count=count+1;
			}
			temp=a;
			while(temp!=0)
			{
				rem=temp%10;
				b = b + Math.pow(rem,count);
				temp=temp/10;
			}
			if(b==a)
			{
				System.out.println("Given number, " + a + " is an Armstrong number.");
			}
			else
			{
				System.out.println("Given number, " + a + " is not an Armstrong number.");
			}	
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int a=sc.nextInt();
	        armstrong(a);
	        sc.close();
		}
	}

	


