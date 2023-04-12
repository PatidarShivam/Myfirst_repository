package precticejava;

public class Oops {
	int carno;
	String carname;
	public Oops(int no,String name)
	{
		 carno=no;
		 carname=name;
	}
	public static void main(String arg[])
	{
		Oops o= new Oops(234,"Ford");
		System.out.println(o.carno+"  "+o.carname);
	}
 
}
