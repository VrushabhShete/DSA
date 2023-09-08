import java.util.ArrayList;
import java.util.Scanner;

public class HyphensToFront {

    static String moveHyphen(String str, int n){
        if(str==null)
        return null;
        String res="";
        for(int i = 0; i<n; i++){
            if(str.charAt(i)=='-'){
                res = str.charAt(i) + res;
            }
            else
            res = res + str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        System.out.println(moveHyphen(str, str.length()));
    }
}
