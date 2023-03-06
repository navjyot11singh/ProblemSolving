package stack;

public class EvaluatePostfix {
    public static void main(String[] args) throws Exception {
        String str = "92/4+5*";
        CustomStack stack = new CustomStack(5);

        for (int i = 0; i < str.length(); i++) {
            int result=0;

            if (isNumeric("" + str.charAt(i))) {
                stack.push(Integer.parseInt("" + str.charAt(i)));
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                if (str.charAt(i) == '+')
                    result = operand1 + operand2;
                else if (str.charAt(i) == '-')
                    result = operand1 - operand2;
                else if (str.charAt(i) == '*')
                    result = operand1 * operand2;
                else if (str.charAt(i) == '/')
                    result = operand1 / operand2;


                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }



    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
