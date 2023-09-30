package org.example;

import org.example.phonebook.Contact;
import org.example.phonebook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();

        Contact contact1 = new Contact("Ott", "Antonia", "0761407107", "antoniaott@gmail.com", "Adress1");

        phoneBook1.addContact(contact1);
        System.out.println(phoneBook1.toString());
    }
}