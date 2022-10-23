class access
{
	private String a = "Nihar";
	void print() {
		System.out.println(a);
	}
}
public class Private_check extends access{

	public static void main(String[] args) {
		access obj = new access();
		obj.print();
		System.out.println(obj.a);
		
	}

}

