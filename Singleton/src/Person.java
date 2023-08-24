public class Person {
    private final int autoId;
    private final String username;
    private final String password;
    private final String gender;

    private static Person instance;

    private Person(int autoId, String username, String password, String gender) {
        this.autoId = autoId;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public static synchronized Person getInstance(int autoId, String username, String password, String gender) {
        if (instance == null) {
            instance = new Person(autoId, username, password, gender);
        }
        return instance;
    }

    public int getAutoId() {
        return autoId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }
}