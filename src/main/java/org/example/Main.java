package org.example;

import org.example.phonebook.Contact;
import org.example.phonebook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();

        Contact contact1 = new Contact("Ott", "Antonia", "0761407107", "antoniaott@gmail.com", "Adress1");
        Contact contact2 = new Contact("Link", "Fabian", "+4917618546327", "fabianlink@gmail.com", "Adress2");
        Contact contact3 = new Contact("Ernst", "Medea", "0303425621", "medeaernst@gmx.de", "Adress3");
        Contact contact4 = new Contact("Berger", "Anne", "0711453627", "annebraun@web.com", "Adress4");
        Contact contact5 = new Contact("Winkler", "Fred", "+4915375647321", "fredwinkler@gamil.com", "Adress5");

        phoneBook1.addContact(contact1);
        phoneBook1.addContact(contact2);
        phoneBook1.addContact(contact3);
        phoneBook1.addContact(contact4);
        phoneBook1.addContact(contact5);
        System.out.println(phoneBook1.toString());

        System.out.println("Hier der gesuchte Kontakt: " + phoneBook1.searchContact("Ott"));
    }
}