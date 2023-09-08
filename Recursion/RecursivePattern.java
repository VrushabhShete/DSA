//Sample input = 1
//Output = 111

//Sample input = 2
//Output = 211121112

//Sample input = 3
//Output = 321112111232111211123


import java.util.Scanner;

public class RecursivePattern{

    static void printPattern(int n){
        if(n == 0)
        return;
        else{
            System.out.print(n + " ");
            printPattern(n-1);
            System.out.print(n + " ");
            printPattern(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        printPattern(n);
    }
}
