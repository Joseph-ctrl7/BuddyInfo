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

    public static void main(String[] args) {
        System.out.println("Address Book");

    }
}
