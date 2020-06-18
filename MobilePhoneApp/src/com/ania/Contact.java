package com.ania;


import java.util.ArrayList;

public class Contact {

    private String name;
    private ArrayList<String> phoneNumbers;

    public Contact(String name, ArrayList<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public static Contact createContact(String name, ArrayList<String> phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String>getPhoneNumber() {
        return phoneNumbers;
    }

    public String getPhoneNumberToString() {
        String phoneNumbers = "";
        for (String number : this.phoneNumbers) {
            phoneNumbers += number +", ";
        }
        return phoneNumbers.substring(0, phoneNumbers.length()-3);
    }

}
