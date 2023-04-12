package precticejava;

public class Hero extends Bike {
	
     void run()
     {
    	 System.out.println("Bike ir running");
     }
     public static void main(String[] ar)
     {
    	 Bike b= new Hero();
    	 b.run();
    	 
     }
}
