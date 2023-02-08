package practice.filesPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamPractice {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("navjyot.bin"));
            objectOutputStream.writeUTF("Hello how are you bro");

        }catch (IOException e){
            System.out.print(e.getMessage());
            System.exit(0);
        }finally {
            objectOutputStream.close();
        }
    }

}
