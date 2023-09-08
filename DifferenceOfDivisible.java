import java.util.Scanner;

public class DifferenceOfDivisible {

    static int divisible(int n, int m){
        int sum=0, sumnot=0;
        
        if(n>0 && m>0){
            for(int i=1; i<=m; i++){
                if(i%n == 0)
                {
                    sum += i;
                }
                else
                {
                    sumnot+=i;
                }
            }
        }
        int total = sumnot - sum;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("The difference is: "+divisible(n, m));
    }
}
