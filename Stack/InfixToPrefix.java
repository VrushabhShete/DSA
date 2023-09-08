import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class InfixToPrefix {
    
    static int precedence(char c){
        switch(c){
            case '+':
            case '-':
            return 1;

            case '*': case '/':
            return 2;

            case '^':
            return 3;
        }   
        return -1;     
    }

    static boolean checkOperator(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    static boolean checkOperand(char c){
        return  ((c>='a' && c<='z') || (c>='A' && c<='Z'));
    }

    static void convert(StringBuilder exp){
        Stack<Character> s = new Stack<>();
        StringBuilder result= new StringBuilder();
        exp.reverse();

        for(int i= 0; i<exp.length(); i++){
            if(checkOperand(exp.charAt(i))){
                result.append(exp.charAt(i));
            }

            else if(exp.charAt(i) == ')')
            s.push(exp.charAt(i));

            else if(exp.charAt(i) == '('){
                while(s.empty()==false && s.peek()!=')'){
                    result.append(s.peek());
                    s.pop();
                }
                if(s.empty()==false && s.peek()!=')')
                return;
                else s.pop();
            }

            else{
                while(s.empty()==false && precedence(exp.charAt(i)) < precedence(s.peek())){
                    result.append(s.peek());
                    s.pop();
                }
                s.push(exp.charAt(i));
            }
        }
        while(s.empty() == false){
            result.append(s.peek());
            s.pop();
        }
        System.out.println(result.reverse());
    }

    public static void main(String[] args) {
        StringBuilder exp = new StringBuilder("a+b*(c^d-e)^(f+g*h)-i");
        convert(exp);
    }
}
