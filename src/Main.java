public class Main {

    public static void main(String[] args){
        System.out.println("Hello World!!");
        ContactsManager contactsManager = new ContactsManager();
        Contact contact1 = new Contact();
        contact1.name = "Contact 1";
        contact1.email = "Email 1";
        contact1.phoneNumber = "123-456-7890";
        Contact contact2 = new Contact();
        contact2.name = "Contact 2";
        contact2.email = "Email 2";
        contact2.phoneNumber = "123-456-7890";
        System.out.println("Add Contact");
        contactsManager.addContact(contact1);
        contactsManager.addContact(contact2);
        System.out.println("Search Contact");
        Contact searchedContact = contactsManager.searchContact("Contact 1");

            System.out.println("Email: " + searchedContact.email);

    }
}
class Contact{
    String name;
    String email;
    String phoneNumber;
}
class ContactsManager{
    private Contact[] myFriends;
    private int friendsCount;
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
        System.out.println("Contact Added");
    }
    Contact searchContact(String searchName){
        for (int i=0;i<friendsCount;i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
