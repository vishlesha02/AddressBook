package Day8;

import java.util.Scanner;

public class contactPerson extends AddressBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBookUC3 a = new AddressBookUC3();
        while (1 < 2) {
            System.out.println("Enter number \n 1-Add \n 2-Update \n 3-Show \n 4-exit");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("Enter a number to add ::\n 1 - First Name \n 2 - Last Name \n 3 - City \n 4 - State \n 4 - address \n 4 - Zip \n 7 - Phone Number \n 8- Display \n 9 - Delete everything \n 10 - Return to Main Menu ");
                a.Addcontact();
            } else if (num == 2) {
                a.editcontact();
            } else if (num == 3) {
                a.showlist();
            } else {
                break;
            }
        }
    }
}
