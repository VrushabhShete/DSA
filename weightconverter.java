import java.util.*;

public class weightconverter {
	double weightkgs;

	public static void main(String args[]){
//		Weight w = new Weight();
		Scanner sc = new Scanner(System.in);
		double weightkgs = sc.nextDouble();
		convert(weightkgs);
	} 
	
	static void convert (double weightkgs) {
			System.out.println("The weight in grams and milligrams is: "+ weightkgs*1000d + " grams and "+ weightkgs*1000000d + " milligrams");
		}
	
}

