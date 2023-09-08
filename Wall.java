import java.util.*;

public class Wall{
	private double width;
	private double height;
	 
	Wall(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	
		void setWidth(double width){
			if(width<0)
				width = 0;
			this.width = width;
		}
		void setHeight(double height){
			if(height<0)
				height = 0;
			this.height = height;
		}
		double getWidth(){
			return width;
		}
		double getHeight(){
			return height;
		}
		void getArea(double width, double height){
			double area = width * height;
			System.out.println("The area is: "+ area);
		}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width");
		double width = sc.nextDouble();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		Wall w = new Wall(width, height);
		w.setWidth(width);
		w.setHeight(height);
		w.getArea(width, height);
		
	}
}