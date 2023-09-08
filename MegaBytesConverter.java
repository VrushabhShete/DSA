import java.util.*;

public class MegaBytesConverter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int kilobytes = sc.nextInt();
		printMegaBytes(kilobytes);
	}
		static void printMegaBytes(int kilobytes){
			System.out.println("The Megabytes are: "+ kilobytes/1024 + " MB");
		}
}