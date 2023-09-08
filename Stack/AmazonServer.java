import java.util.Stack;

public class AmazonServer {

    static String printReplacedString(String s, Stack stk){
        if(s == null)
        System.out.println("Invalid String");

        String latest = "";

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '?'){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == '0'){
                while(! stk.empty()){
                    latest += s.charAt(i);
                    stk.pop();
                }
                latest += s.charAt(i);
            }
            else latest += s.charAt(i);
        }
        return latest;
    }

    static String printSecondString(String s, Stack stk){
        if(s == null)
        System.out.println("Invalid String");

        String secondlatest = "";

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '1'){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == '?' && ! stk.empty()){
                secondlatest += stk.peek();
            }
            else secondlatest += s.charAt(i);
        }
        return secondlatest;
    }

    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();

        String s = "??011??0";
        System.out.println(printReplacedString(s, stk));
        System.out.println(printSecondString(s, stk));
    }
}
