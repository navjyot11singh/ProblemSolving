package practice.string;

public class reverseString {
    public static void main(String[] args) {
        String s = "navjyot";
        char[] characterArray = new char[s.length()];
        for(int i =0;i<s.length();i++){
            characterArray[i]=s.charAt(i);
        }

        StringBuilder newString  = new StringBuilder();
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            char temp;
            temp = characterArray[start];
            characterArray[start] = characterArray[end];
            characterArray[end] = temp;

            start++;
            end--;

        }

        for(int i =0;i<s.length();i++){
            newString.append(characterArray[i]);
        }

        System.out.println(newString);
    }
}
