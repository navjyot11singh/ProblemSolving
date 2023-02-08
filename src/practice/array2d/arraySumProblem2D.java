package practice.array2d;


//Write a Java program to find all pairs of elements in a 2D array whose sum is equal to a specified number.
public class arraySumProblem2D {
    public static void main(String[] args) {
        int x = 10;
        int[][] array = {{2,10,8,6,4,0,3,7},{8,2,3,4,5,4,7,9}};

        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                for(int k=0;k<array[i].length;k++){
                    if(array[i][j]+array[i][k]==x){
                        System.out.println(array[i][j]+" "+array[i][k]);
                    }
                }
            }
        }
    }



}
