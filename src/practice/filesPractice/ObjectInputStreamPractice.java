package practice.filesPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamPractice {
    public static void main(String[] args){
        ObjectInputStream objectInputStream=null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("navjyot.bin"));
            String str = objectInputStream.readUTF();
            System.out.println(str);
        }catch (IOException e){
            System.out.println("we are here");
            System.out.println(e.getMessage());
        }
    }
}
