package practice.filesPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInput1 {
    public static void main(String[] args) throws IOException{
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileOutputStream("kashish.txt"));
            printWriter.println("Hi hlofdfd ");
            printWriter.println("Hi hlofdfd ");
            printWriter.println("Hi hlofdfd ");

        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch(Exception e){

        }finally {
            printWriter.close();
        }

    }
}



