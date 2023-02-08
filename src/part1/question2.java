package part1;

public class question2 {
    public static void main(String[] args) {
        String str = "gggN@@@@@KKeeeejjjjjdsmmu";
        StringBuilder s = new StringBuilder();
        char ch='a';
        int count=0;
        int maxCount = 0;
        char maxCharacter = '$';

        for(int i =0;i<str.length();i++){

            if(str.charAt(i) != ch){
                ch = str.charAt(i);
                if ( count>1)
                    s.append(count);
                s.append(ch);
                count=0;
            }

            if(ch == str.charAt(i)) {
                count++;
            }

            if(maxCount<count){
                maxCount=count;
                maxCharacter=ch;
            }

        }
        System.out.println(s);
        System.out.println("Maximum count and character are "+maxCharacter+" "+maxCount);
    }
}
