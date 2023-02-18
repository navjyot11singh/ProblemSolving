package practice.recursion;

//Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
// except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
public class count8 {

    public static void main(String[] args) {
        System.out.println(count8(88818));
    }

    public static int count8(int n) {
        if(n==0){
            return 0;
        }
        if((n/10)%10==8 && n%10==8){
            return count8(n/10)+2;
        }
        else if(n%10==8){
            return count8(n/10)+1;
        }
        else{
            return count8(n/10);
        }


    }

}
