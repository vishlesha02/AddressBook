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

    public void setPincode(int pincode) {
        this.zip = zip;
        list.add(zip);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.add(phoneNumber);
    }



    /*-------------------------Edit List----------------------------------*/


    public void editFirstName(int f, String firstName) {
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

    public void editZip(int p, int zip) {
        this.zip = zip;

        list.set(p, zip);
    }

    public void editPhoneNumber(int ph, int phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.set(ph, phoneNumber);
    }


    public void showlist() {
        System.out.println(list);
    }

    /*--------------------------------------Add to List----------------------------------*/

    public void Addcontact() {

        while (1 < 2) {
            System.out.println("Enter a number to update :\n 1 - First name \n 2 - LastName \n 3 - City \n 4 - State\n 4 - address \n 4 - zip \n 7 - Phone Number \n 8 - Display \n 9 - Delete List \n 10 - Return to Main Menu ");
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
            } else if (n == 9) {
                deletelist();
            } else {
                break;
            }
        }
    }

    /*-----------------------------------UPDATE-------------------------------------*/
    public void updatecontact() {

        while (1 < 2) {
            System.out.println("Enter a number to update ::\n 1 - First Name \n 2 - LastName \n 3 - City \n 4 - State\n 4 - Address \n 4 - zip \n 7 - Phone Number \n 8 - Display List \n 9 - Delete List \n 10 - Return to Main Menu ");
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
                String address = sc.next();
                editAddress(4,address);
            } else if (u == 6) {
                System.out.println("Enter the Phone Number");
                int phone = sc.nextInt();
                editPhoneNumber(5,phone);
            } else if (u == 7) {
                System.out.println("Enter the Zip");
                int zip = sc.nextInt();
                editZip(6,zip);

            } else if (u == 8) {
                showlist();
            } else if (u == 9) {
                deletelist();
            } else {
                break;
            }
        }
    }
    /*---------------------------------------DELETE LIST--------------------------*/

    public void deletelist() {
        list.clear();
        System.out.println(list);
    }

}