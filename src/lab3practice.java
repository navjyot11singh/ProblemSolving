import java.io.StringReader;
import java.util.Scanner;

public class lab3practice {
//    public static void main(String[] args) {
////        int[] digits = {0};
////        boolean isIt = true;
////
////        long res = 0;
////        for (int i = 0; i < digits.length; i++) {
////            res = res * 10 + digits[i];
////            System.out.println(res);
////        }
////        System.out.println("Final result: " + res);
////
////        int length = digits.length;
////        long digit = 9;
////        long temp = res;
////        while (temp != 0) {
////
////            int current_digit = (int) (temp % 10);
////
////            temp = temp / 10;
////            if (current_digit != digit) {
////                isIt = false;
////            }
////        }
////
////        if(isIt){
////
////                length = digits.length+1;
////            }
////
////        res = res+1;
////
////        int[] newArray = new int[length];
////        int i=length-1;
////        while(res > 0 && i>=0){
////            int x = (int) (res%10);
////            res = res/10;
////            newArray[i]=x;
////            i--;
////        }
////
////        for (int k = 0; k < length; k++) {
////
////            System.out.println(newArray[k]);
////        }
////
//
//
////        String str =
////                "Using the String[] method to convert a string to array in Java";
////
////        // Passing the string to String[] {}
////        String[] arr = new String[] {str};
//
//        // Printing the elements of the string array using a for loop
////        for(int i=0;i<arr.length;i++) {
////            System.out.println(arr[i]);
////        }
//        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
//    }
//
//
//    public static char[] toMyArray (String s)
//    {
//        StringReader reader = new StringReader (s);
//        int k = 0;
//        int i = 0;
//        char[] output = new char[s.length ()];
//        try{
//            while ((k = reader.read ()) != -1){
//                output[i] = ((char) k);
//                i++;
//            }
//
//        }catch (Exception e){}
//        return output;
//    }
//
//    public static String longestCommonPrefix(String[] strs) {
//        // Longest common prefix string
//        StringBuilder longestCommonPrefix = new StringBuilder();
//        // Base condition
//        if (strs == null || strs.length == 0) {
//            return longestCommonPrefix.toString();
//        }
//        // Find the minimum length string from the array
//        int minimumLength = strs[0].length();
//        for (int i = 1; i < strs.length; i++) {
//            minimumLength = Math.min(minimumLength, strs[i].length());
//        }
//        // Loop for the minimum length
//        for (int i = 0; i < minimumLength; i++) {
//            // Get the current character from first string
//            char current = strs[0].charAt(i);
//            // Check if this character is found in all other strings or not
//            for (String str : strs) {
//                if (str.charAt(i) != current) {
//                    return longestCommonPrefix.toString();
//                }
//            }
//            longestCommonPrefix.append(current);
//        }
//        return longestCommonPrefix.toString();
//    }

    public static void FirstSecond(int[] arr) {
        int[][] count = new int[arr.length][2];
        int lastIndexOfCount = 0;
        for(int i=0; i<arr.length; i++) {

            //find index of element if already exists
            int indexOfExistingEle = 99999;
            for(int j=0; j<count.length; j++) {
                if(count[j][0] == arr[i]) {
                    indexOfExistingEle = j;
                }
            }

            // if already exists increase count or add new entry
            if(indexOfExistingEle == 99999) {
                count[lastIndexOfCount][0] = arr[i];
                count[lastIndexOfCount][1] = 1;
                lastIndexOfCount++;
            }
            else {
                count[indexOfExistingEle][1] += 1;
            }
        }

        //find no of unique values and highest and secondHighest number
        int noOfUniqueVal = 0;
        int highestOccurenceCount = 0;
        int highestOccurenceNumber = 0;
        int secondHighestOccurenceCount = 0;
        int secondHighestoccurenceNumber = 0;
        for(int j=0; j<count.length; j++) {
            if(count[j][1] == 1) {
                noOfUniqueVal += 1;
            }

            if(count[j][1] > highestOccurenceCount) {
                highestOccurenceCount = count[j][1];
                highestOccurenceNumber = count[j][0];
            }

        }

        for(int j=0; j<count.length; j++) {
            if(count[j][1] < highestOccurenceCount && count[j][1] > secondHighestOccurenceCount) {
                secondHighestOccurenceCount = count[j][1];
                secondHighestoccurenceNumber = count[j][0];
            }
        }

        //check if modification is required
        if(noOfUniqueVal == arr.length || noOfUniqueVal == arr.length-1) {
            //No modification required
        }
        else {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] == secondHighestoccurenceNumber) {
                    arr[i] = highestOccurenceNumber;
                }
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int[] arr = new int[sizeOfArr];

        sc.nextLine();
        String[] temp = new String[sizeOfArr];
        temp = sc.nextLine().split(" ");
        for(int i=0; i<sizeOfArr; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        FirstSecond(arr);

        String result = "";
        for(int i=0; i<sizeOfArr; i++) {

            if(i == sizeOfArr-1) {
                result += Integer.toString(arr[i]);
            }
            else {
                result += Integer.toString(arr[i]);
                result += " ";
            }
        }
        System.out.print(result);

        sc.close();
    }



}
