package practice.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of number is ");
        int f = findFactorial(7);
        System.out.println(f);
    }

    static int findFactorial(int x){
        if(x==0){
            return  1;
        }else{
            return x * findFactorial(x-1);
        }
    }
}
