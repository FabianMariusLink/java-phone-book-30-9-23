package org.example.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    List<Contact> contacts = new ArrayList<>();

    public PhoneBook() {
    }

    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    public Contact searchContact(String lastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        System.out.println("Contact dont exist");
                return null;
    }

    public void editContact(String lastName, String fieldToEdit, String newEntry){
        if(this.searchContact(lastName) != null){
            if (fieldToEdit.equals("first name")) {
                this.searchContact(lastName).setFirstName(newEntry);
            }
            System.out.println("Contact has been edited");
        }

    }

    public void deleteContact(String lastName){
        if(this.searchContact(lastName) != null){
            contacts.remove(this.searchContact(lastName));
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(contacts, phoneBook.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}
