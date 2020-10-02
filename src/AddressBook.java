import java.util.ArrayList;

public class AddressBook{

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();

    }


public void addBuddy(BuddyInfo buddy)
    {
        myBuddies.add(buddy);
    }

    public BuddyInfo removeBuddy(int index)
    {
        if(index >=0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }
    
    private int size() {
        return myBuddies.size();
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println("size: "+ addressBook.size());
        addressBook.removeBuddy(0);
    }
}
