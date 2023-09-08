import java.util.Scanner;

public class ReplaceLetters {

    static String replace(String str, char let1, char let2){
        String res = "";
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==let1)
            res = res + let2;
            else if(str.charAt(i)==let2)
            res = res + let1;
            else res = res + str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char let1 = sc.next().charAt(0);
        char let2 = sc.next().charAt(0);
        System.out.println(replace(str, let1, let2));
    }
}
