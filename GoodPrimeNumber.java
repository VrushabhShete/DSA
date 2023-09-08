import java.util.Scanner;

public class GoodPrimeNumber {

    static boolean isPrime(int k){
        int num = 0;
        while(k!=0){
            k = k%10;
            num = num + k;
            k = k/10;
        }
        for(int i=2; i<k/2; i++){
            if(num % i == 0)
            return false;
        }
        return true;
    }

    static int findFinal(int n, int k){
        int count=1;        
        while(n<=k){
            if(isPrime(n)){
                if(count==k)
                return n;
                else {
                    n++;
                    count++;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(findFinal(n, k));
    }
}
