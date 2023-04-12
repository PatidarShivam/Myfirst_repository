package precticejava;

public class Area {
     int lenth;
     int breadth;
     
    
     Area(int lenth, int breadth)
     {
    	 this.lenth=lenth;
    	 this.breadth=breadth;
     }
     public void getArea()
     {
    	 int area=lenth*breadth;
    	 System.out.println("Area= "+area);
     }
}
    