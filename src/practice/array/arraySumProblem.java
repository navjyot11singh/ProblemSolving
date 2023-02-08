package practice.array;


//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
public class arraySumProblem {
    public static void main(String[] args) {
        int x = 10;
        int[] array = {2,10,8,6,4,0,3,7};

        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j] == x){
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
    }



}
