package practice.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,3,4,3,5,3,34,6,4,0};

        for(int i =0;i<array.length;i++){
            int min = i;

            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
