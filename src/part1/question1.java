package part1;

public class question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int start = 0;
        int left;
        int right;
        int mid = arr.length/2;

        if(arr.length%2==0){
            if(mid%2==0){
                left = mid;
                right = mid;
            }
            else{
                left = mid+1;
                right = mid+1;
            }
        }
        else{
            if(mid%2==0){
                left = mid;
                right = mid+1;
            }
            else{
                left = mid+1;
                right = mid+2;
            }
        }

        while(start<left){
            int temp = arr[start];
            arr[start] = arr[start+1];
            arr[start+1] = temp;
            start += 2;
        }

        while(right<arr.length){
            int sum = arr[right]+arr[right+1];
            arr[right+1] = sum;
            right += 2;
        }

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
