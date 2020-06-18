package com.ania;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MobilePhone {
    private String myNumber;
    private Map<String, Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new HashMap<>();
    }

    public boolean addNewContact(Contact contact) {
        if(myContacts.get(contact.getName()) != null) {
            System.out.println("Contact is already on file");
            return false;
        }
        if (contact.getPhoneNumber().isEmpty()) {
            System.out.println("No phone number provided");
            return false;
        }
        for (String key: myContacts.keySet()) {
            myContacts.get(key).getPhoneNumber().indexOf(contact.getPhoneNumber().get(0));
        }
        myContacts.put(contact.getName(), contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(myContacts.get(oldContact.getName())!= null){
            ArrayList<String> phoneNumbers = oldContact.getPhoneNumber();
            phoneNumbers.addAll(newContact.getPhoneNumber());
            Contact contact =  Contact.createContact(newContact.getName(), phoneNumbers);
            myContacts.remove(oldContact.getName());
            myContacts.put(newContact.getName(), contact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
        else {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }
    }

    public boolean removeContact(Contact contact) {

        if(myContacts.remove(contact.getName()) != null) {
            System.out.println(contact.getName() + ", was deleted.");
            return true;
        }
        System.out.println(contact.getName() + ", was not found.");
        return false;

    }

    public String queryContact(Contact contact) {
        if (myContacts.get(contact.getName()) != null) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
            return this.myContacts.get(name);
    }

    public void printContacts() {
        System.out.println("Contact List");
        int i =0;
        for(String key : myContacts.keySet()){
               System.out.println((i++ + 1) + "." +
                       myContacts.get(key).getName() + " -> " +
                       this.myContacts.get(key).getPhoneNumberToString());
        }
    }

}

