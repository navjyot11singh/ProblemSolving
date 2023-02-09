package practice.array;


//This question is to compare two string arrays for equality - (this might be lil bit tricky at first)
//This question is part of the first question that came in our lab4 exam. We can use this exactly as it in matrix logic.


//S1 S2 C2 C0 C1 L3
//S1 S2 C2 C0 C1 L3
//S2 S1 C0 C2 L3 C1
//S0 C2 S1 L0 C1 S2 --->answer is row1 and row2 is equal  and row 2 and row 3 is equal



public class CompareArrayString {
    public static void main(String[] args) {

//        //Test case 1
//        String[] array1 = {"A","C","D","F","D","K","A","B"};//--->just a reminder double quotes is string and single quotes is char
//        String[] array2 = {"C","A","F","D","K","D","B","C"};

//        //Test case 2
//        String[] array1 = {"S1","S3","S2","S1","C2","C1","L3","L0"};//--->just a reminder double quotes is string and single quotes is char
//        String[] array2 = {"S3","S1","S1","S2","C1","C2","L0","L3"};


        //Test case 3
        String[] array1 = {"S1","S3","S2","S1","C2","C1","L3","L0"};//--->just a reminder double quotes is string and single quotes is char
        String[] array2 = {"S3","S1","S1","S2","C1","C2","L0"};

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

    static String[] sortIt(String[] array){
        for(int i =0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    String temp="";
                    temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }


    static boolean compareArray(String[] array1,String[] array2){
        boolean isEqual = true;
        if(array1.length!=array2.length){
            return false;
        }
        for(int i=0;i<array1.length;i++){
            if(!array1[i].equals(array2[i])){
                isEqual=false;
            }
        }
        return isEqual;
    }

}
