package practice.filesPractice;

import java.io.*;

public class FileInput2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = null;
        PrintWriter p= null;

        try {
            fileInputStream = new FileInputStream("kashish.txt");
            char s = (char) fileInputStream.read();
            p= new PrintWriter(new FileOutputStream("kashish.txt"));

            System.out.println(s);
            p.write(s);
        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch(Exception e){

        }finally {
            p.close();
            fileInputStream.close();
        }

    }
}



