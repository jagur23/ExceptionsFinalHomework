public class UserData {

    private String[] userData;
    private String surname;

    public UserData(String[] userData) {
        this.userData = userData;
    }

    public String getSurname() {
        return surname = userData[0];
    }

    @Override
    public String toString() {
        return userData[0] + " " + userData[1] + " " + userData[2] + " " + userData[3] + " " +
                userData[4] + " " + userData[5] + "\n";
    }
}
