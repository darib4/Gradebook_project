package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageManager {
    private ResourceBundle messages;

    public LanguageManager(String languageCode) {
        setLanguage(languageCode);
    }

    public void setLanguage(String languageCode) {
        Locale locale = new Locale(languageCode);
        this.messages = ResourceBundle.getBundle("messages", locale);
    }

    public String getMessage(String key) {
        return messages.getString(key);
    }
}

