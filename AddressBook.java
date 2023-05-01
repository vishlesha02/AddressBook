package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    public String firstName, lastName, address, city, state;
    public int zip;
    public int phoneNumber;

    Scanner sc = new Scanner(System.in);
    ArrayList list = new ArrayList();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        list.add(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        list.add(lastName);
    }

    public void setAddress(String address) {
        this.address = address;
        list.add(address);
    }

    public void setCity(String city) {
        this.city = city;
        list.add(city);
    }

    public void setState(String state) {
        this.state = state;
        list.add(state);
    }

    public void setPincode(int zip) {
        this.zip = zip;
        list.add(zip);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.add(phoneNumber);
    }

    public void showlist() {
        System.out.println(list);
    }
    public void Addcontact() {

        while (1<2) {

            System.out.println("Enter a number to Add : \n 1 - First Name \n 2 - Last Name \n 3 - City \n 4 - State\n 4 - Address \n 4 - Zip \n 7 - Phone Number \n 8 - Display List \n 9  - Return to Main menu ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Enter the First Name");
                String fn = sc.next();
                setFirstName(fn);
            }
            else if (n == 2) {
                System.out.println("Enter the Last Name");
                String ln = sc.next();
                setLastName(ln);
            }
            else if (n == 3) {
                System.out.println("Enter the City");
                String city = sc.next();
                setCity(city);
            }
            else if (n == 4) {
                System.out.println("Enter the State");
                String state = sc.next();
                setState(state);
            }
            else if (n == 5) {
                System.out.println("Enter the Address");
                String address = sc.next();
                setAddress(address);
            }
            else if (n == 6) {
                System.out.println("Enter the Phone Number");
                int phone = sc.nextInt();
                setPhoneNumber(phone);
            }
            else if (n == 7) {
                System.out.println("Enter the Zip");
                int zip = sc.nextInt();
                setPincode(zip);
            }
            else if (n == 8) {
                showlist();
            }
            else {
                break;
            }
        }
    }


}