import java.util.Scanner;

public class tax {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double tax=0.0;
			System.out.println("Your CTC: ");
			double sal=sc.nextDouble();
			if((sal > 0) && (sal < 180000))
			{
				tax=0.0;
			}
			else if((sal > 181001.0) && (sal < 300000.0))
			{
				tax=sal*(0.1);
			}
			else if((sal > 300001) && (sal < 500000))
			{
				tax=sal*(0.2);
			}
			else if((sal > 500001) && (sal < 1000000))
			{
				tax=sal*(0.3);
			}
	        System.out.println("Total Income Tax: " +tax);
	        sc.close();
		}
 
}
