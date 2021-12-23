import java.util.Scanner;

public class login {
	
	static void validate(String name,String pwd,int attempts)
	{
		String userName="Harsha",password="1235678";
		int result;
		if(attempts<=3)
		{
			if(name.equals(userName) && pwd.equals(password))
			{
				System.out.println("Welcome " + userName);
			}
			else
			{
				System.out.println("Invalid Login");
                attempts=attempts+1;
				details(attempts);
			}
        }
        else{
            System.out.println("Contact Admin: +91 9999955555");
        }
	}
	static void details(int attempts)
	{
		Scanner sc=new Scanner(System.in);
		String password,userName;
		System.out.println("Username: ");
		userName=sc.next();
		System.out.println("Password: ");
		password=sc.next();
		//System.out.println(name+"  "+password);
        validate(userName,password,attempts);
        sc.close();
	}
	public static void main(String[] args) 
	{
		int attempts=1;
		details(attempts);
	}
}


