package practice.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4,3,4,3,5,3,34,6,4,0};
        int[] newArray = mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    static int[] mergeSort(int[] array){
        if(array.length>1){
            int mid = array.length/2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[array.length-mid];

            for(int i =0;i<mid;i++){
                leftArray[i] = array[i];
            }

            int k=0;
            for (int i=mid;i<array.length;i++){
                rightArray[k]=array[i];
                k++;
            }


            mergeSort(leftArray);
            mergeSort(rightArray);

            int i=0,j=0,l=0;

            while (i<leftArray.length && j< rightArray.length){
                if(leftArray[i]<rightArray[j]){
                    array[l]=leftArray[i];
                    i=i+1;
                }else{
                    array[l]=rightArray[j];
                    j=j+1;
                }
                l=l+1;
            }
        }

        return array;

    }
}
