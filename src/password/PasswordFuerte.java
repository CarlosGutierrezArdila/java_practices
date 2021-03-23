package password;

public class PasswordFuerte extends Password{
    public PasswordFuerte( String value) {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", value);
    }
}
