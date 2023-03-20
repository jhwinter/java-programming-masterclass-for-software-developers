package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " already exists.");
            return false;
        }
        myContacts.add(contact);
        // System.out.println(contact.getName() + " added.");
        return findContact(contact.getName()) >= 0;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact.getName());
        if (position < 0) {
            System.out.println(oldContact.getName() + " does not exist.");
            return false;
        }
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("Contact with name = " + newContact.getName() +
                    ", phone number = " + newContact.getPhoneNumber() +
                    " already exists.");
            return false;
        }
        myContacts.set(position, newContact);
        System.out.println("Contact with name = " + oldContact.getName() +
                ", phone number = " + oldContact.getPhoneNumber() +
                " replaced with name = " + newContact.getName() +
                ", phone number = " + newContact.getPhoneNumber() + "."
        );
        return findContact(newContact.getName()) >= 0;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact.getName());
        if (position < 0) {
            System.out.println(contact.getName() + " does not exist.");
            return false;
        }
        myContacts.remove(position);
        System.out.println(contact.getName() + " was deleted.");
        return findContact(contact) < 0;
    }


    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        return position < 0 ? null : myContacts.get(position);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " +
                    contact.getName() +
                    " -> " + contact.getPhoneNumber()
            );
        }
    }
}
