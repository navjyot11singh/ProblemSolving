package practice.recursion;

//We have a number of bunnies and each bunny has two big floppy ears.
//We want to compute the total number of ears across all the bunnies recursively
//(without loops or multiplication).
public class bunnyEars {
    public static void main(String[] args) {

        int x = bunnyEars(5);
        System.out.println(x);

    }

    public static int bunnyEars(int bunnies) {
        if(bunnies==0){
            return 0;
        }else{
            return bunnyEars(bunnies-1)+2;
        }
    }
}
