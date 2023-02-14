package practice.filesPractice;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOP1 {
    public static void main(String[] args) {
        String s1,s2;
        PrintWriter pw = null;
        Scanner kb =  new Scanner(System.in);
        Scanner sc  = null;

        System.out.println("Please enter the name of the file you need to copy "+"as well as the name of the file to be created: ");

        s1 = kb.next();
        s2 = kb.next();

        try {
            sc  = new Scanner(new FileInputStream(s1));
            pw = new PrintWriter(new FileOutputStream(s2));
        } catch (FileNotFoundException e) {
            System.out.println("Problem opening files. Cannot proceed to copy.");
            System.out.println("Program will terminate.");
            System.exit(0);
        }

        fileCopy(sc,pw);

        System.out.println("File has been copied");
    }

    private static void fileCopy(Scanner sc, PrintWriter pw) {
        // Read line by line from input file and copy it to output file
        String str;

        while(sc.hasNextLine())
        {
            str = sc.nextLine();
            pw.println(str);

        }
        // Must close the files to flush the buffers
        sc.close();
        pw.close();

    }
}
