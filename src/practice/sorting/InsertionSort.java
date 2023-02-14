package practice.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4,3,4,3,5,3,34,6,4,0};
        for (int i =0;i< array.length;i++){
            int j = i-1;
            while(j>0 && array[j]<array[j-1]){
                int temp = array[j];
                array[j]=array[j-1];
                array[j-1] = temp;
                j=j-1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
