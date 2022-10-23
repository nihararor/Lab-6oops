class Worker{
	String name; 
	int emp_no;
	Worker(int emp_no, String name)
	{
		this.emp_no = emp_no;
		this.name = name;
	}
	void print()   
	{
		System.out.println("ID : " + this.emp_no);
		System.out.println("Name : "+this.name);
	}
}
class DailyWorker extends Worker
{
	int rate;
	DailyWorker(int emp_no, String name, int rate)  
	{
		super(emp_no, name);  
		this.rate = rate;
	}
	void print()
	{
		super.print();
		System.out.println("Rate : "+this.rate);
	} 
	
	void ComPay(int hours)
	{
		if(hours > 7*24)
		{
			System.out.println("Wrong hours input !");
			return;
		}
		System.out.println("Total pay is : " + rate*hours);
	}
}
class SalariedWorker extends Worker
{
	int rate;
	SalariedWorker(int emp_no, String name, int rate)
	{
		super(emp_no, name);
		this.rate = rate;
	}
	void print()
	{
		super.print();  
		System.out.println("Rate : "+this.rate);
	} 
	int hours = 40;
	void ComPay()
	{
		System.out.println("Total pay is : " + rate*hours);
	}
}
public class Question_3 {
	public static void main(String[] args) {
		DailyWorker obj = new DailyWorker(1, "Mohit", 400);
		obj.print();
		obj.ComPay(89);
		SalariedWorker obj1 = new SalariedWorker(2, "Sanjay", 1000);
		obj1.print();
		obj1.ComPay();
	}
}
