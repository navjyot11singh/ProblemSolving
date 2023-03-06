package practice.filesPractice;

import java.io.*;
import java.util.Scanner;

public class FileInput3 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileInputStream("kashish.txt"));

            while(scanner.hasNext()){
                String s = scanner.nextLine();
                System.out.println(s);
            }
        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch(Exception e){

        }finally {

        }

    }
}



