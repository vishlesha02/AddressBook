package Day8;

import java.util.Scanner;

public class contactPerson extends AddressBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBookUC4 a = new AddressBookUC4();
        while (1 < 2) {
            System.out.println("Enter number \n 1-Add \n 2-Edit \n 3-Show \n 4-Delete \n 5-exit");
            int num = sc.nextInt();
            if (num == 1) {
                a.Addcontact();
            } else if (num == 2) {
                a.updatecontact();
            } else if (num == 3) {
                a.showlist();
            }
            else if (num == 4)
            {
                a.deletelist();
            }else {
                break;
            }
        }
    }
}
