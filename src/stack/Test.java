package stack;

public class Test {
    public static void main(String[] args) {
//        CustomStack customStack = new CustomStack(5);
        DynamicStack customStack = new DynamicStack(5);


        customStack.push(1);
        customStack.push(3);
        customStack.push(2);
        customStack.push(8);
        customStack.push(6);

        //if isserting this data with customstack it will show full so we implement dynamic stack
        customStack.push(6);




        try{
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
