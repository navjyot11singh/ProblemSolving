package practice.recursion;

public class powerN {
    public static int powerN(int base, int n) {
        if(n==0){
            return 1;
        }
        if(base==0){
            return 0;
        }else{
            return base * powerN(base,n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(powerN(10,2));
    }
}
