package part2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Inspiron", 4343434, 44444);
        Computer computer1 = new Computer("Dell", "Inspiron", 4343434, 44444);
        Computer computer2 = new Computer("Dell", "Inspiron", 4343434, 44444);
        System.out.print("Lets check for default values of computer3: ");
        Computer computer3 = null;

        System.out.println("Lets change the values for computer3");

        System.out.print("Lets check for new values of computer3: ");

        System.out.println("number of object created are " + computer2.findNumberOfCreatedComputers());
        System.out.println("Comparing two objects ... lets check if computer1 is equal to computer2 "
                + computer1.equals(computer2));

        System.out.println("\nUser tell me what do you want to do, we already have 3 computers with us: ");
        System.out.println("""
                1. Make a new default model and show the values\s
                2. Display all computers\s
                3. Modify First Computer and show the result\s
                4. Modify the newly created computer\s
                5. Compare computer1 and computer2\s
                6. Check total no of computers in inventory\s
                7. Exit
                """);

        Scanner scanner =
                new Scanner(System.in);
        int input = 0;
        while (input != 7) {
            System.out.println("Enter your choice : ");
            input = scanner.nextInt();
            switch (input) {
                case 1 -> computer3 = createNewClass(computer3);
                case 2 -> {
                    System.out.println("Brand    Model       SN           Price");
                    displayRecords(computer);
                    displayRecords(computer1);
                    displayRecords(computer2);
                }
                case 3 -> changeSpecs(computer1, scanner);
                case 4 -> changeSpecs(computer3, scanner);
                case 5 -> System.out.println("It is " + computer1.equals(computer2));
                case 6 -> System.out.println("Total: " + computer1.findNumberOfCreatedComputers());
                case 7 -> System.out.println("Thanks for using computer inventory !!! \n Have a nice day !!!! ");
                default -> System.out.println("Please enter the correct choice \n ");
            }
        }


    }

    static Computer createNewClass(Computer computer3) {
        computer3 = new Computer();
        System.out.println("Brand    Model       SN           Price");
        displayRecords(computer3);
        return computer3;
    }

    static void displayRecords(Computer computer) {
        System.out.println(computer);

    }

    static Computer changeSpecs(Computer comp, Scanner scanner) {
        System.out.print("Enter Brand: ");
        String b = scanner.nextLine();
        System.out.print("Enter Model: ");
        String m = scanner.nextLine();
        System.out.print("Enter Price: ");
        double p = scanner.nextDouble();
        System.out.print("Enter SN: ");
        long s = scanner.nextLong();

        comp.setModel(m);
        comp.setPrice(p);
        comp.setBrand(b);
        comp.setSN(s);
        System.out.println("Brand    Model       SN           Price");
        displayRecords(comp);
        return comp;
    }


}
