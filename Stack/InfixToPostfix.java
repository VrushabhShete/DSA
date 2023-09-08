import java.util.Stack;

public class InfixToPostfix {

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

    static void convert(String exp){
        Stack<Character> s = new Stack<>();
        String result ="";

        for(int i=0; i<exp.length(); i++){
            if((exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z') || exp.charAt(i) >= 'A' && exp.charAt(i) <= 'Z')
            result = result + exp.charAt(i);

            else if(exp.charAt(i) == '(')
            s.push(exp.charAt(i));

            else if(exp.charAt(i) == ')'){
                while(s.empty() == false && s.peek() != '('){
                     result = result + s.peek();
                     s.pop();
                }
                if(s.empty() == false && s.peek() != '(')
                return;
                else
                s.pop();
            }
            else{
                while(s.empty() == false && precedence(exp.charAt(i)) <= precedence(s.peek())){
                    result = result + s.peek();
                    s.pop();
                }
                s.push(exp.charAt(i));
            }
        }

        while(s.empty() == false){
            result = result + s.peek();
            s.pop();
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String exp = "a+b(c*d)+e";
        System.out.println("The Postfix expression is: ");
        convert(exp);
    }
}
