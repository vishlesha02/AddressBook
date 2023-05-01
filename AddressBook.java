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

    /*-------------------------------EDIT LIST-------------------------------------------*/

    public void editFirstName(int f, String firstName)
    {
        this.firstName = firstName;
        list.set(f, firstName);

    }

    public void editLastName(int l, String lastName) {
        this.lastName = lastName;
        list.set(l, lastName);

    }


    public void editAddress(int a, String address) {
        this.address = address;
        list.set(a, address);

    }

    public void editCity(int c, String city) {
        this.city = city;
        list.set(c, city);
    }

    public void editState(int s, String state) {
        this.state = state;
        list.set(s, state);

    }

    public void editzip(int p, int zip) {
        this.zip = zip;
        list.set(p, zip);
    }
    public void editPhoneNumber(int ph, int phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.set(ph, phoneNumber);
    }
    /*--------------------------------------------Add Contact----------------------------------------*/
    public void Addcontact() {

        while (true) {
            System.out.println("Enter a number to Add : \n 1 - First Name \n 2 - Last Name \n 3 - City \n 4 - State \n 4 - Address \n 4 - Zip \n 7 - Phone Number \n 8 - Display List  \n 9 - Return to Main menu ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Enter the firstname");
                String fn = sc.next();
                setFirstName(fn);
            } else if (n == 2) {
                System.out.println("Enter the Lastname");
                String ln = sc.next();
                setLastName(ln);
            } else if (n == 3) {
                System.out.println("Enter the City");
                String city = sc.next();
                setCity(city);
            } else if (n == 4) {
                System.out.println("Enter the State");
                String state = sc.next();
                setState(state);
            } else if (n == 5) {
                System.out.println("Enter the Address");
                String adrr = sc.next();
                setAddress(adrr);
            } else if (n == 6) {
                System.out.println("Enter the Phone Number");
                int phone = sc.nextInt();
                setPhoneNumber(phone);
            } else if (n == 7) {
                System.out.println("Enter the Pincode");
                int pin = sc.nextInt();
                setPincode(pin);
            } else if (n == 8) {
                showlist();
            } else {
                break;
            }
        }
    }

    /*-----------------------------------------------EDIT LIST--------------------------------------*/
    public void editcontact() {

        while (true) {
            System.out.println("Enter a number to update : \n 1 - First name \n 2 - LastName \n 3 - City \n 4 - State\n 4 - Address \n 4 - Zip \n 7 - phonenumber \n 8- Display List \n 9 - Return to main menu ");
            int u = sc.nextInt();

            if (u == 1) {
                System.out.println("Enter the firstname");
                String fn = sc.next();
                editFirstName(0,fn);
            } else if (u == 2) {
                System.out.println("Enter the Lastname");
                String ln = sc.next();
                editLastName(1,ln);
            } else if (u == 3) {
                System.out.println("Enter the City");
                String city = sc.next();
                editCity(2,city);
            } else if (u == 4) {
                System.out.println("Enter the State");
                String state = sc.next();
                editState(3,state);
            } else if (u == 5) {
                System.out.println("Enter the Address");
                String adrr = sc.next();
                editAddress(4,adrr);
            } else if (u == 6) {
                System.out.println("Enter the Phone Number");
                int phone = sc.nextInt();
                editPhoneNumber(5,phone);
            } else if (u == 7) {
                System.out.println("Enter the Zip");
                int pin = sc.nextInt();
                editzip(6,pin);

            } else if (u == 8) {
                showlist();

            } else {
                break;
            }
        }
    }

}