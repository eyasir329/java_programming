 import java.util.Stack;
class Main{
    static String bracketMatcher(String st){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    return "No";
                }
                char top = stack.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
                    return "No";
                }
            }
        }
        return stack.isEmpty()?"Yes":"No";
    }

    public static void main(String[] args){
        String st = "(([]{}[{}]){})[]";
        System.out.println(bracketMatcher(st));
    }
 }
