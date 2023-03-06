package stack;

public class ParenthesisCheck {
    public static void main(String[] args) throws Exception {
        System.out.println(isBalanced("()()())"));
    }

    public static boolean isBalanced(String str) throws Exception {
        CustomStack stack = new CustomStack(6);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(stack.isEmpty()){
                    return  false;
                }else if(stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }



}
