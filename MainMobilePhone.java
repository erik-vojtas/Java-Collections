import java.util.Scanner;

public class MainMobilePhone {

    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.



    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("John");
        Contact contact1 = new Contact("Bob", "+43 123 456 789");

        iPhone.storeContact(contact1);

        StartPhone();
        PrintMenu();

        boolean quit = false;
        while(!quit) {
            Scanner scanner = new Scanner(System.in);
            int user_input = scanner.nextInt();
            scanner.nextLine();

            switch(user_input) {
                case 0:
                    PrintMenu();
                    break;
                case 1:
                    iPhone.printContacts();
                    break;
                case 2:
                    System.out.println("What contact would you like to add? Type a name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter a phone number: ");
                    String phone_num = scanner.nextLine();
                    iPhone.storeContact(new Contact(name, phone_num));
                    break;
                case 3:
                    System.out.println("What contact would you like to update? Enter a number: ");
                    int index0 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Type a name: ");
                    String name0 = scanner.nextLine();
                    System.out.println("Type a phone number: ");
                    String phone_num0 = scanner.nextLine();
                    iPhone.modifyContactName((index0-1), new Contact(name0, phone_num0));
                    break;
                case 4:
                    System.out.println("What contact would you like to delete? Enter a number: ");
                    int index1 = scanner.nextInt();
                    scanner.nextLine();
                    iPhone.removeContact((index1-1));
                    break;
                case 5:
                    System.out.println("What contact would you like to call? Enter a number: ");
                    int index2 = scanner.nextInt();
                    scanner.nextLine();
                    iPhone.callContact((index2-1));
                    break;
                case 6:
                    System.out.println("Your Phone is switching off, good bye...");
                    quit = true;
                    break;
            }
        }
    }


    private static void StartPhone() {
        System.out.println("Starting phone...");
    }


    private static void PrintMenu() {
        System.out.println("Menu: \n" +
                "0 - show menu \n" +
                "1 - show contacts \n" +
                "2 - add contact \n" +
                "3 - modify contact \n" +
                "4 - delete contact \n" +
                "5 - call contact \n" +
                "6 - exit \n" +
                "Enter a number: \n");
    }



}
