package practice.filesPractice;

import java.io.*;

public class FileInput5 {
    public static void main(String[] args) throws IOException{
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("kashish.dat"));


        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch(Exception e){

        }finally {
//            bufferedReader.close();
        }

    }
}



