import java.util.*;
public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        String str=kk.next();
        System.out.println(Matched(str));
    }
    static boolean Matched(String str){
        int n=str.length();
        Deque<Character> stack= new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char x=str.charAt(i);
            if(x=='(' || x=='[' || x=='{')
                stack.push(x);
            else {
                if(stack.isEmpty()==true)
                    return false;
                else if (valid(stack.peek(),x)==false) {
                    return false;
                }
                    else
                        stack.pop();
            }

        }
        return stack.isEmpty()==true;
    }
    static boolean valid(char open,char close){
        return (open=='(' && close==')') || (open=='[' && close==']') || (open=='{' && close=='}');
    }
}
