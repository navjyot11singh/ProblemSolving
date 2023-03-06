package stack;

//reverse a string using stack
public class ReverseString {
    public static void main(String[] args) throws Exception {
        String str = "navjyot";
        CustomStack customStack = new CustomStack(7);
        for (int i = 0; i < str.length(); i++) {
            customStack.push(str.charAt(i));
        }
        for (int i = 0; i <str.length(); i++) {
            System.out.print((char)customStack.pop());
        }
    }
}
