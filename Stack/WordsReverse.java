import java.util.Stack;

public class WordsReverse {

    static void reverse(String orig){
        String temp = "", ans= "";
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i< orig.length(); i++){
            temp = temp + orig.charAt(i);
            if(orig.substring(i, i+1).equals(" ")){    
                stack.push(temp);
                temp = "";
            }
        }
        stack.push(temp);

        while(!stack.empty()){
            temp = ans + stack.peek();
            stack.pop();
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        String orig = "My name is Vrushabh";

        reverse(orig);
    }
}
