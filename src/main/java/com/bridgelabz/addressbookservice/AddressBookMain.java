package com.bridgelabz.addressbookservice;

import java.sql.SQLException;
import java.util.List;


public class AddressBookMain {
        AddressBook addressBook = new AddressBook();
    public static void main(String[] args) throws SQLException {
        System.out.println("..... Welcome In Address Book System Program Using JDBC");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.retrieveData();
        addressBookMain.updateContacts();
    }

        private void retrieveData() throws SQLException {
            List<Contacts> addressBookList = addressBook.retrieveData();
            System.out.println(addressBookList);
        }
       private void updateContacts(){
        addressBook.updateContacts(8002695700l,500050l);
    }
}



