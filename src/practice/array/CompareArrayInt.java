package practice.array;


//This question is to compare two integer arrays for equality
public class CompareArrayInt {
    public static void main(String[] args) {
        //Test case 1
//        int[] array1 = {5,3,4,3,5,3,2,1};
//        int[] array2 = {3,4,3,5,5,1,3,2};
//
//        //Test case 2
//        int[] array1 = {5,3,4,3,5,3,2,1};
//        int[] array2 = {3,4,3,5,5,1,3,6};

        //Test case 3
        int[] array1 = {5,3,4,3,5,3,2,1};
        int[] array2 = {3,4,3,5,5,1,3};

        //sorting the array first
        array1 = sortIt(array1);
        array2 = sortIt(array2);

        boolean isEqual = compareArray(array1,array2);

        if(isEqual){
            System.out.println("Array is equal");
        }else{
            System.out.println("Array is not equal");
        }

    }

    static int[] sortIt(int[] array){

        for(int i =0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=0;
                    temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }


    static boolean compareArray(int[] array1,int[] array2){
        boolean isEqual = true;
        if(array1.length!=array2.length){
            return false;
        }

        for(int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                isEqual=false;
            }
        }

        return isEqual;
    }

}
