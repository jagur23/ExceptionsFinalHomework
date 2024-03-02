import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {

    public boolean isValidArgumentQty(String str) {
        String[] dataArray = str.split(" ");
        if (str.isEmpty() || dataArray.length != 6) {
            System.err.println("The wrong amount of data has been entered!");
            return false;
        }
        return true;
    }

    public boolean isValidFIO(String string) {
        char[] strArray = string.toCharArray();
        for (char c : strArray) {
            if(Character.isLowerCase(strArray[0]) || Character.isDigit(c)) {
                System.err.println("Name, surname and patronymic cannot contain digits and must start from title letter.");
                return false;
            }
        }
        return true;
    }

    public boolean isValidBirthdayFormat(String birthday) { // dd.mm.yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try{
            dateFormat.parse(birthday);
            return true;
        } catch (ParseException e) {
            System.err.println("Wrong date of birth format. Try this: dd.mm.yyyy");
            return false;
        }
    }

    public boolean isValidPhoneNumber(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Wrong phone number format! Use only digits!");
            return false;
        }
    }

    public boolean isValidGender(String str) {
        if(str.length() > 1) {
            System.err.println("Wrong gender! Write 'f' - female or 'm' - male.");
        }
        char c = str.charAt(0);
        if((c != 'f' && c != 'm') || str.length() > 1) {
            System.err.println("Wrong gender! Write 'f' - female or 'm' - male.");
            return false;
        }
        return true;
    }
}
