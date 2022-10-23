class Employee
{
	String name;
	int empid;
	int salary;
	Employee() 
	{
		this.name = "Nihar";
		this.empid = 18;
		this.salary = 230000;
	}
	Employee(String n,int e,int s) 
	{
		this.name=n;
		this.empid=e;
		this.salary=s;	
	}
	String names() 
	{
		return this.name;
	}
	int salaries()
 	{
 		return salary;
 	}
	double increaseSalary(double per_rate) 
	{
		double a = (this.salary*(per_rate/100));
		double s = this.salary + a;
		return s;
	}
}
public class Question_5 {	
	String department="CSE";
	public static void main(String[] args) {
		Employee obj = new Employee("Mohit", 24, 238547);
		System.out.println(obj.names());
		System.out.println(obj.salary);
		System.out.println(obj.increaseSalary(3.4));
	}
}
