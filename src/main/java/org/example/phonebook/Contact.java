package org.example.phonebook;

import com.sun.source.tree.ClassTree;

import java.util.Objects;

public class Contact {
    private final int id;
    private static int totalContacts = 0;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private String adress;


    public Contact(String lastName, String firstName, String phoneNumber, String email, String adress) {
        this.id = totalContacts++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public static int getTotalContacts() {
        return totalContacts;
    }

    /*public static void setTotalContacts(int totalContacts) {
        Contact.totalContacts = totalContacts;
    }*/

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(lastName, contact.lastName) && Objects.equals(firstName, contact.firstName) && Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(email, contact.email) && Objects.equals(adress, contact.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, phoneNumber, email, adress);
    }

    @Override
    public String toString() {
        return "\nContact{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
