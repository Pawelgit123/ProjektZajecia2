package configuration;

import javax.mail.Session;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MailConfiguration {

    public MailConfiguration() {
        prepareConfiguration();
    }

    private Properties properties;
    private String userName;
    private String password;

    private void prepareConfiguration() {
        properties = new Properties();
        try (FileReader reader = new FileReader("mail.properties")){
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "465");
//        properties.put("mail.smtp.ssl.enable", "true");
//        properties.put("mail.smtp.auth", "true");
        userName =  properties.getProperty("mail.username");
        password =  properties.getProperty("mail.password");
//pfff
    }

    public Session createSession() {
        return Session.getDefaultInstance(properties, new GmailAutenticator(userName,password));
    }
}
