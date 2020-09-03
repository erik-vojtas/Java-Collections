import java.util.ArrayList;

//    Able to store, modify, remove and query contact names.

public class MobilePhone {

    private ArrayList<Contact> contacts;
    private String name;

    public MobilePhone(String name) {
        this.name = name;
        this.contacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public String getName() {
        return name;
    }

    private boolean searchContact(Contact contact) {
        if(contacts.contains(contact)) {
            return true;
        }
        return false;
    }

    private Contact findContactName(String name) {
        for(int i=0; i<contacts.size(); i++) {
            if(name.equals(contacts.get(i).getName())) {
                return contacts.get(i);
            }
        }
        return null;
    }

    private Contact findContactPhoneNumberS(String phone_number) {
        for(int i=0; i<contacts.size(); i++) {
            if(phone_number.equals(contacts.get(i).getPhone_number())) {
                return contacts.get(i);
            }
        }
        return null;
    }

    private int findContact(Contact contact) {
        int position = contacts.indexOf(contact);
        if(position >=0) {
            return position;
        }
        return -1;
    }


    public void storeContact(Contact contact) {
        if (searchContact(contact)) {
            System.out.println("Contact " + contact.getName() + " already exists, can't be stored again!");
        } else {
            contacts.add(contact);
            System.out.println("Contact " + contact.getName() + " has been stored.");
        }
    }

    public void printContacts() {
        if (contacts.size() > 0) {
            for(int i = 0; i < contacts.size(); i++) {
                System.out.println((i+1) + ". " + contacts.get(i).getName() + ", " + contacts.get(i).getPhone_number());
            }
        } else {
            System.out.println("No contacts...");
        }

    }

    public void modifyContactName(int position, String new_name) {
        Contact modified_contact = contacts.get(position);
        Contact newContact = new Contact(new_name, modified_contact.getPhone_number());
        contacts.set(position, newContact);
        System.out.println("Contact " + newContact.getName() + " has been updated.");
    }

    public void modifyContactName(int position, Contact new_contact) {
        contacts.set(position, new_contact);
        System.out.println("Contact " + new_contact.getName() + " has been updated.");
    }

    public void removeContact(int position) {
        Contact selected_contact = contacts.get(position);
        contacts.remove(position);
        System.out.println("Contact " + selected_contact.getName() + " has been removed.");
    }


    public void callContact(int index) {
        System.out.println(contacts.get(index).getName() + " has been called.");

    }




}
