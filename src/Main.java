import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int array[];
        array = new int[value];

        for(int i=0;i<value;i++){
            array[i] = scanner.nextInt();
        }

        for(int i=0;i<value;i++){
            System.out.print(array[i]);
        }



    }




}