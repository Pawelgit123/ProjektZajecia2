package configuration;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GmailAutenticator extends Authenticator {

    private String username;
    private String password;

    public GmailAutenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(username,password);
    }

}
