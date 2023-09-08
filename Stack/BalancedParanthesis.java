import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {
    
    
    static boolean checkPair(char val1, char val2){
        return ((val1 == '{' && val2 == '}') || (val1 == '(' && val2 == ')') || (val1 == '[' && val2 == ']'));
    }

    static boolean checkBalanced(String expr){
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i=0; i<expr.length(); i++){
            if(expr.charAt(i) == '{' || expr.charAt(i) == '[' || expr.charAt(i) == '(')
            stack.push(expr.charAt(i));
            else{
                stack.peek();
                if(stack.isEmpty())
                return false;
                else if(checkPair(stack.peek(), expr.charAt(i))){
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String expr = "{[](())}}";
        System.out.println(checkBalanced(expr) ? "Balanced": "Unbalanced");

    }
}
