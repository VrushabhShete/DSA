import java.util.Scanner;

public class Carry {

    static int findCarries(int num1, int num2){
        int total=0, temp1 = 0, temp2=0;

        while(num1>0 && num2>0){
            temp1 = (num1%10) + (num2%10) + temp2;
            if(temp1 > 9){
                temp2 = temp1/10;
                total++;
            }
            num1/=10;
            num2/=10;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(findCarries(num1, num2));
    }
}
