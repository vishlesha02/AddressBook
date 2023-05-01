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

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setAddress(String address) {
        this.address = address;

    }

    public void setCity(String city) {
        this.city = city;

    }

    public void setState(String state) {
        this.state = state;

    }

    public void zip(int zip) {
        this.zip = zip;

    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;

    }


}