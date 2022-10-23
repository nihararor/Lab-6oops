class Player{
	int sr_no; String name; String sport;
	Player(int sr_no, String name)
	{
		this.sr_no = sr_no;
		this.name = name;
	}
	void print()
	{
		System.out.println(this.sr_no + " " + this.name + " " + this.sport);
	}
}
class Cricket_Player extends Player{
	Cricket_Player(int sr_no, String name, String sport)
	{
		super(sr_no, name);
		this.sport = sport;
	}
}
class Football_Player extends Player
{
	Football_Player(int sr_no, String name, String sport)
	{
		super(sr_no, name);
		this.sport = sport;
	}
}
class Hockey_Player extends Player
{
	Hockey_Player(int sr_no, String name, String sport)
	{
		super(sr_no, name);
		this.sport = sport;
	}
}
public class Question2 
{
	public static void main(String[] args) {
		Cricket_Player obj = new Cricket_Player(1,"Virat Kohli", "Cricket");
		obj.print();
		Football_Player obj1 = new Football_Player(2,"Ronaldo", "Football");
		obj1.print();
		Hockey_Player obj2 = new Hockey_Player(3,"Dhayan Chand", "Hockey");
		obj2.print();	
	}

}

