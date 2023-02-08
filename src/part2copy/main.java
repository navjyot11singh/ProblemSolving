package part2copy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Declaring Scanner and taking input for computers in inventory
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Computer Inventory User !!!");
        int numOfComputers = 0;
        System.out.println("Enter number of computers you want to store in your inventory:");
        numOfComputers = scanner.nextInt();

        //Computer inventory declaration
        Computer[] inventory = new Computer[numOfComputers];

        int userInput = 1;
        String password = "password";
        int count = 0;

        //Displaying user menu and taking user input
        while (userInput != 5) {
            System.out.print("What do you want to do?" +
                    "\n 1. Enter new computers (password required)" +
                    "\n 2. Change information of a computer (password required)" +
                    "\n 3. Display all computers by a specific brand" +
                    "\n 4. Display all computers under a certain a price. \n" +
                    " 5. Quit \n" +
                    "Please enter your choice >");
            userInput = scanner.nextInt();
            scanner.nextLine();

            //switch conditions for all input types
            switch (userInput) {
                case 1:
                    inventory = addUpdateComputer(count, scanner, password, inventory, false);
                    break;
                case 2:
                    inventory = addUpdateComputer(count, scanner, password, inventory, true);
                    break;
                case 3:
                    findComputersBy(inventory, scanner);
                    break;
                case 4:
                    findCheaperThan(inventory, scanner);
                    break;

                case 5:
                    System.out.println("Thankful for using Computer Inventory !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter correct input !!\n");
                    break;
            }
        }
    }

    //function for finding computers with particular brand
    static void findComputersBy(Computer[] inventory, Scanner scanner) {
        System.out.print("Enter brand --> ");
        String brand = scanner.nextLine();

        for (int i = 0; i < inventory.length; i++) {
            if (brand.equals(inventory[i].getBrand())) {
                System.out.println("Brand: " + inventory[i].getBrand());
                System.out.println("Model: " + inventory[i].getModel());
                System.out.println("Price: " + inventory[i].getPrice());
                System.out.println("SN: " + inventory[i].getSN());
            }
        }
    }

    //function for finding computers with price cheaper than the input price
    static void findCheaperThan(Computer[] inventory, Scanner scanner) {
        System.out.print("Enter price --> ");
        double price = scanner.nextDouble();

        for (int i = 0; i < inventory.length; i++) {
            if (price >= inventory[i].price) {
                System.out.println("Brand: " + inventory[i].getBrand());
                System.out.println("Model: " + inventory[i].getModel());
                System.out.println("Price: " + inventory[i].getPrice());
                System.out.println("SN: " + inventory[i].getSN());
            }
        }


    }


    //common function for checking the password and calling update or add condition
    static Computer[] addUpdateComputer(int count, Scanner scanner, String password, Computer[] inventory, boolean isUpdate) {
        String enterPassword = "";
        while (count < 3) {
            System.out.println("Please enter password: ");

            enterPassword = scanner.nextLine();

            if (enterPassword.equals(password)) {
                count = 0;
                //condition to check update or input condition
                if (isUpdate) {
                    inventory = updateRecords(inventory, scanner);
                } else
                    inventory = inputRecords(inventory);
                return inventory;
            } else {
                count++;
                System.out.println("Please enter correct password ");
                System.out.println("You have " + (3 - count) + " tries left");
                System.out.println("count now is " + count);
            }
        }
        return inventory;

    }


    //function for inputting record
    static Computer[] inputRecords(Computer[] inventory) {
        boolean isFilled = true;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                isFilled = false;
                inventory[i] = new Computer();
            }
        }


        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }


        if (isFilled) {
            System.out.println("Sorry! your inventory is filled");
        }

        return inventory;
    }

    //function for updating records

    static Computer[] updateRecords(Computer[] inventory, Scanner scanner) {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }
       int position= scanner.nextInt();

        scanner.nextLine();
        if (inventory[position - 1] == null && position <= inventory.length) {
            String yesNo = "";
            System.out.println("There is no computer to update");
            System.out.println("Do you want to add a new computer (Y/N) ?");
            yesNo = scanner.next();

            if (yesNo == "Y") {
                inventory[position - 1] = new Computer();
            } else {
               return inventory;
            }

        } else {

            int choice = 1;
            while (choice != 5){
                System.out.println("What information would you like to\n" +
                        "change?\n" +
                        "1. brand\n" +
                        "2. model\n" +
                        "3. SN\n" +
                        "4. price\n" +
                        "5. Quit\n" +
                        "Enter your choice >");
                 choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Enter the brand");
                        String brand = scanner.nextLine();
                        inventory[position - 1].setBrand(brand);
                        break;
                    case 2:
                        System.out.println("Enter the model");
                        String model = scanner.nextLine();
                        inventory[position - 1].setBrand(model);
                        break;
                    case 3:
                        System.out.println("Enter the price");
                        double price = scanner.nextDouble();
                        inventory[position - 1].setPrice(price);
                        break;
                    case 4:
                        System.out.println("Enter the SN");
                        long sn = scanner.nextLong();
                        inventory[position - 1].setSN(sn);

                    case 5:
                        System.out.println("Thankful for using Computer Inventory !");
                        return inventory;
                    default:
                        System.out.println("Please enter correct input !!\n");
                        break;
                }
            }

            System.out.println("Updated inventory: ");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println(inventory[i]);
            }
        }


        return inventory;
    }

}
