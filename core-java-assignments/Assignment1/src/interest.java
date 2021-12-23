import java.util.Scanner;

public class interest {
	
	static double simpleInterest(double p,double t,double r)
	{
		double simple;
		simple=(p*t*r)/100;
		return simple;
		
	}
	static double compoundInterest(double p,double t,double r) 
	{
		double compound;
		compound= p*(Math.pow((1 + (r/100)),t));
		return compound;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double p,t,r,s,c;
		System.out.println("Principal Amount: ");
		p=sc.nextInt();
		System.out.println("Time (in years): ");
		t=sc.nextInt();
		System.out.println("Rate (percentage): ");
		r=sc.nextInt();
		s=simpleInterest(p,t,r);
		c=compoundInterest(p,t,r);
		System.out.println("Simple Interest: "+ s + "\nCompound Interest: " + c);
		sc.close();
	}
}


