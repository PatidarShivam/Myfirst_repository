package precticejava;
import java.util.Scanner;

public class Add {
   public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int a,b,c;
	System.out.println("Enter value of a: ");
	a=sc.nextInt();
	System.out.println("Enter value of b: ");
	b=sc.nextInt();
	c=a+b;
	int d=a*b;
	int s=b-a;
	int div=b/a;
	System.out.println("sum = "+c);
	System.out.println(d);
	System.out.println(s);
	System.out.println(div);
}
	
}
