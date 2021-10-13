import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[CAP][0-9]{4}[GHIKLM]");
        Matcher matcher;
        String[] validClass = new String[]{"C0318G","A1234L"};
        String[] invalidClass = new String []{"M0318G","P0323A","A1234$L"};
        for (String c:
        validClass){
            matcher = p.matcher(c);
            System.out.println(matcher.matches());
        }for (String c:
        invalidClass){
            matcher = p.matcher(c);
            System.out.println(matcher.matches());
        }
    }
}
