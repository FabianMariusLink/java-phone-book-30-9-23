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
        return null;
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
