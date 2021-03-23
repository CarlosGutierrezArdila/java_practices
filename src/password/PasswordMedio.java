package password;

public class PasswordMedio extends Password{
    public PasswordMedio(String value) {
        super("^(?=.*[0-9])(?=.*[a-z]).{8,}$", value);
    }
}
