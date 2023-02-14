package practice.sorting;

//This a problem stating bubble sort
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,3,4,3,5,3,34,6,4,0};

        for(int i =0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
