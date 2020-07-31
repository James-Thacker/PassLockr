import com.thacker.passlockr.password.Password;
import com.thacker.passlockr.securetitle.SecureTitle;

public class Main {
    public static void main(String[] args) {
        SecureTitle st = new SecureTitle("The Title");
        Password pass = new Password("GFrdyED%765GYtDRd");

        System.out.println(st.getTitle());
        System.out.println(pass.getPass());
    }
}
