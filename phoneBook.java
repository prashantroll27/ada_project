package phonebook;
import java.util.Scanner;
public class phoneBook {
    public static int menu() {
        System.out.println("    PHONE BOOK APPLICATION");
        System.out.println(" [1]  Add Contacts");
        System.out.println(" [2]  Display All Contacts");
        System.out.println(" [3]  Search by Number");
        System.out.println(" [4]  Search by Name");
        System.out.println(" [5]  Update a contact");
        System.out.println(" [6]  Delete a contact");
        System.out.println(" [7]  Number of contacts");
        System.out.println(" [8]  Exit");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }


    public static void main(String[] args) {
        String[] name = new String[100];
        String[] no = new String[100];
        int k = 0;
        int Total_contacts = 0;
        int check = 0;

        check = menu();
        do {
            // Function to add contacts
            if (check == 1) {
                System.out.print("Name: ");
                Scanner scanner = new Scanner(System.in);
                name[k] = scanner.nextLine();
                System.out.print("Phone no: ");
                no[k] = scanner.nextLine();
                k++;
                Total_contacts++;
            }
            // Function to display contacts
            else if (check == 2) {
                int check2 = 0;
                for (int i = 0; i < 100; i++) {
                    if (name[i] != null) {
                        System.out.println("Name: " + name[i] + "      Phone: " + no[i]);
                        check2++;
                    }
                }
                if (check2 == 0) {
                    System.out.println("\t\t\t\t\t");
                }
            }
            // Function to Search by Number
            else if (check == 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Number: ");
                String temp = scanner.nextLine();
                int check2 = 0;
                for (int i = 0; i < 100; i++) {
                    if (temp.equals(no[i])) {
                        System.out.println("Number is Found");
                        System.out.println("Name: " + name[i] + "       Phone: " + no[i]);
                        check2++;
                    }
                }
                if (check2 == 0) {
                    System.out.println("This Number is Not found in your contact list");
                }
            }
            // Function to Search By Name
            else if (check == 4) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Name: ");
                String temp = scanner.nextLine();
                int check2 = 0;
                for (int i = 0; i < 100; i++) {
                    if (temp.equals(name[i])) {
                        System.out.println("Name is Found");
                        System.out.println("Name: " + name[i] + "       Phone: " + no[i]);
                        check2++;
                    }
                }
                if (check2 == 0) {
                    System.out.println("This name is Not found in your contact list");
                }
            }
            // Function to Update
            else if (check == 5) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Name: ");
                String temp = scanner.nextLine();
                int check2 = 0;
                for (int i = 0; i < 100; i++) {
                    if (temp.equals(name[i])) {
                        System.out.print("New Name: ");
                        String temp2 = scanner.nextLine();
                        System.out.print("New Number: ");
                        String temp3 = scanner.nextLine();
                        name[i] = temp2;
                        no[i] = temp3;
                        check2++;
                        System.out.println("Updated Successfully");
                    }
                }
                if (check2 == 0) {
                    System.out.println("This name is Not found in your contact list");
                }
            }
            // Function to delete
            else if (check == 6) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("For Delete Enter Name: ");
                String temp = scanner.nextLine();
                int check2 = 0;
                for (int i = 0; i < 100; i++) {
                    if (temp.equals(name[i])) {
                        System.out.println("Deleted Successfully");
                        System.out.println("Name: " + name[i] + "       Phone: " + no[i]);
                        name[i] = null;
                        no[i] = null;
                        check2++;
                        Total_contacts--;
                    }
                }
                if (check2 == 0) {
                    System.out.println("This name is Not found in your contact list");
                }
            } else if (check == 7) {
                System.out.println("Total number of contacts are: " + Total_contacts);
            }
            check = menu();
        } while (check != 8);
    }
}






