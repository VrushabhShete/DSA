import java.util.*;

public class ValidPassword {

    static int valid(String str, int n){
        int cap=0, num=0;    
        if (n<4)
        return 0;
        if(str.charAt(0)>='0' && str.charAt(0)<='9')
        return 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)==' ' || str.charAt(i)=='/')
            return 0;
            if(str.charAt(i) >= 'A' && str.charAt(i)<= 'Z')
            cap++;
            if(str.charAt(i) >= '0' && str.charAt(i)<='9')
            num++;
        }
        if(cap > 0 && num > 0)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       sc.close();
       System.out.println(valid(str, str.length())); 
    }
}
