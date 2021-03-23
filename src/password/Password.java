package password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {
    private String value;
    private String patternString;
    private Pattern pattern;
    private Matcher matcher;

    public Password(String patternString, String value) {
        try {
            this.patternString = patternString;
            this.pattern = Pattern.compile(patternString);
            this.setValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) throws Exception {
        this.matcher = this.pattern.matcher(value);
        if (!matcher.find()) throw new Exception("La contraseña no cumple el patron");
        this.value = value;
    }

    public String getPatternString() {
        return patternString;
    }

    public void setPatternString(String patternString) {
        this.patternString = patternString;
    }
}
