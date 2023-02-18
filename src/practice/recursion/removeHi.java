package practice.recursion;


//
//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
//
//
//        countHi("xxhixx") → 1
//        countHi("xhixhix") → 2
//        countHi("hi") → 1
public class removeHi {
    public static void main(String[] args) {
        System.out.println(countHi("hihowhiareyou"));
    }

    public static int countHi(String str) {
        if(str.length()==0 || str.length()-1==0 ){
            return 0;
        }

        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            return countHi(str.substring(1))+1;
        }else{
            return countHi(str.substring(1));
        }
    }
}
