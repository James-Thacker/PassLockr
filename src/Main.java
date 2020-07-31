import com.thacker.passlockr.recordentry.Record;

public class Main {
    public static void main(String[] args) {
        Record r = new Record("The Title", "abcde");

        System.out.println(r.getTitle());
        System.out.println(r.getPass());
    }
}
