package precticejava;
import java.util.Scanner;
 
public class febonacci{

	public static void main(String[] args) {
    
		int num,r, s,sum=0;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		s=num;
		while(num>0)
		{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		
		}
		if(s==sum)
		{
			System.out.println(s+" is Palendrome");
		}
		else {
			System.out.println(s+" is not palindrom");
		}
  }
}
