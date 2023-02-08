package practice.jaggedArray;

//In this problem I will move all the duplicate to left side of the array
public class moveDuplicatesToSide {
    public static void main(String[] args) {

        //need to move 0 to right
        int[] array = {5,6,10,0,60,61,0,90,0};

        int read = array.length-1;
        int write = array.length-1;

        while(read>=0){
            if(array[read]==0){
                read = read-1;
            }else{
                array[write]=array[read];
                read = read-1;
                write = write-1;
            }

        }

        for(int i=write;i>=0;i--){
            array[i]=0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
