package practice.filesPractice;

import java.io.*;
import java.util.Scanner;

public class FileInput4 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("kashish.txt"));


            int x  = bufferedReader.read();

            while(true){
                System.out.print((char) x);
                x = bufferedReader.read();
            }

        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch(Exception e){
            

        }finally {
            bufferedReader.close();
        }

    }
}



