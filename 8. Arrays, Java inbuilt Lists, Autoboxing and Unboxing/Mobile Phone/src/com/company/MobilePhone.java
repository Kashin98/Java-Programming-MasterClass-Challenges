package com.company;

import java.util.ArrayList;

    public class MobilePhone {
        private String myNumber;
        private ArrayList<Contact> myContacts;

        public MobilePhone(String myNumber) {
            this.myNumber = myNumber;
            myContacts = new ArrayList<Contact>();
        }

        public boolean addNewContact(Contact contact){
            if(myContacts.contains(contact)){
                System.out.println("This contact already exists");
                return false;
            }else {
                myContacts.add(contact);
                System.out.println(contact.getName() + " was added.");
                return true;
            }
        }

        public boolean updateContact(Contact oldContact, Contact newContact){
            int pos = findContact(oldContact);
            if(pos >= 0){
                myContacts.set( pos, newContact);
                System.out.println(oldContact.getName()+" updated to -> " + newContact.getName());
                return true;
            }else {
                return false;
            }
        }

        public boolean removeContact(Contact contact){
            int pos = findContact(contact);
            if(pos >= 0){
                myContacts.remove(pos);
                return true;
            }else {
                return false;
            }
        }

        private int findContact(Contact contact){
            return myContacts.indexOf(contact);
        }

        public int findContact(String name){
            for (int i=0; i < myContacts.size(); i++){
                if(myContacts.get(i).getName().equals(name)){
                    return i;
                }
            }
            return -1;
        }

        public Contact queryContact(String name){
            int pos = findContact(name);
            if(pos >= 0){
                return myContacts.get(pos);
            }else {
                return null;
            }
        }

        public void printContacts(){
            for (int i=0; i < myContacts.size(); i++){
                System.out.println(myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
            }
        }
    }
