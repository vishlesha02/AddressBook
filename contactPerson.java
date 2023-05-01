package Day8;

import java.util.Scanner;

public class contactPerson extends AddressBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook ab = new AddressBook();
        while(1<2) {
            System.out.println("Enter Number for following Operations \n 1-Add \n 2-Show the List");
            int num = sc.nextInt();
            if (num==1){
                System.out.println("Enter a number to add :\n 1 - First Name \n 2 - Last Name \n 3 - City \n 4 - State\n 4 - Address \n 4 - Zip\n 7 - Phone Number \n 8 - Display List \n 9 - Delete List \n 10 - Return to Main menu ");
                ab.Addcontact();
            }
            else if (num == 2) {
                ab.showlist();
            } else {
                break;
            }
        }
    }
}
