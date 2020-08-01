import com.thacker.passlockr.recordentry.Record;
import com.thacker.passlockr.userentry.User;

public class Main {
    public static void main(String[] args) {
        User u = new User("James Thacker", "1qaz");
        u.addEntry("Amazon", "qwertyuiop");

        //FIX HOW THE KEY IS STORED, use the hashcode of the string to store values
        //Handle not found errors
        System.out.println(u.getRecord("Amazon"));
        System.out.println(u.getRecord("Amazon").getTitle());
        System.out.println(u.getRecord("Amazon").getPass());
        System.out.println(u.getNumEntries());
        u.deleteRecord("Amazon");
        System.out.println(u.getNumEntries());
    }
}
