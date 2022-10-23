class call{
	String type;
	float duration; 
	
	call(String type, float duration)
	{
		this.type = type;
		this.duration = duration;
	}
	void print()
	{
		System.out.println("Type : " + this.type);
		System.out.println("Duration " + this.duration);
	}
	float rate()
	{
		if(type.equals("urgent"))
			return 4.5f;
		else if(type.equals("lightning"))
			return 3.5f;
		else
			return 3f;
	}
	
}
class charges extends call{
	float total_charge;
	charges(String type, float duration)
	{
		super(type, duration);
		charge(this.duration);
	}
	void charge(float duration){
		total_charge = rate()*duration;
	}
	void print()
	{
		super.print(); 
		System.out.println("Total charge : "+ this.total_charge);
	}
}

public class Question_4 {

	public static void main(String[] args) {
		charges obj = new charges("ordinary",20);
		obj.print();
		charges obj1 = new charges("urgent",20);
		obj1.print();
		charges obj2 = new charges("lightning",20);
		obj2.print();
	}

}