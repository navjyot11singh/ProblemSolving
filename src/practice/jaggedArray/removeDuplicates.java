package practice.jaggedArray;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][];

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }
            array[i] = arr;
        }

        for(int i=0;i<n;i++){
            removeDuplicates(array[i]);
        }
    }



    static void removeDuplicates(int[] array){
        int k=0;
        int[] newArray = new int[array.length];
        for(int i =0;i<array.length;i++){
            if(!containsNumber(newArray,array[i])){
                newArray[k]=array[i];
                System.out.print(newArray[k]);
                k++;
            }

        }
        System.out.println();
    }

    static boolean containsNumber(int[] array,int number){
        boolean isContain= false;
        for(int i =0;i<array.length;i++){
            if(array[i]==number){
                isContain = true;
                break;
            }
        }
        return  isContain;
    }
}
