

public class Employee <T,K,V,E>
{
    private T id;
    private K name;
    private V salary;
    private E department;

    public Employee (T id,K name, V salary , E department)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public <S> void displayDetails()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}