package precticejava;

public class Polymorphism {
       public static void main(String ard[])
       {
    	   Bank b;
    	   b=new SBI();
    	   System.out.println("Rate of interest in Sbi : "+b.getRateOfIntrest());
           
    	   b=new ICICI();
    	   System.out.println("Rate of interest in ICICI : "+b.getRateOfIntrest());
           
    	   b=new Axis();
    	   System.out.println("Rate of interest in Axis : "+b.getRateOfIntrest());
       }
}
