package practice.string;

public class reverseStringVariation {
    public static void main(String[] args) {
        String s = "I am navjyot singh";
        //output will be singh navjyot am I
        String[] newArray  = s.split(" ");


        int start = 0;
        int end = newArray.length-1;

        while(start<end){
            String temp;
            temp = newArray[start];
            newArray[start] =  newArray[end];
            newArray[end] = temp;
            start++;
            end--;

        }

        for(int i =0;i< newArray.length;i++){
            System.out.println(newArray[i]+" ");
        }

    }
}
