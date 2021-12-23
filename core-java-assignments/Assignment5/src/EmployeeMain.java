import java.util.HashSet;

public class EmployeeMain {
	
    public static void main(String[] args) {
    	
        HashSet<Employee> a = new HashSet<>();
        
        a.add(new Employee<Integer, String, Double, String>(10,"humera",27.89,"Devops"));
    a.add(new Employee<Integer, String, Double, String>(11,"hmera",27.9,"Devps"));
        printhashSet(a);
        
    }
public static void printhashSet(HashSet<Employee> h)
    {
        for (Employee temp:h) {
            System.out.println(temp);
        }
    }


}