import java.util.*;

public class PythagoreanTriplet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		calculate(a,b,c);
		
	}	
		static void calculate(int a, int b, int c){
			int x = a*a;
			int y = b*b;
			int z = c*c;
			
			if((x+y)==z)
				System.out.println(a + " " + b + " " + c + " are PythagoreanTriplets.");
			else				
				System.out.println(a + " " + b + " " + c + " are not Pythagorean Triplets.");
		}
}