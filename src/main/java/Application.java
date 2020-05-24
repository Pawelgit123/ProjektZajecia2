import configuration.MailConfiguration;
import gui.UserInterface;
import mail.GmailMailService;

import java.util.Scanner;

public class Application {

    private Scanner scanner;

    public Application(){
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Application application =   new Application();
        application.start();

    }

    private void start() {
        MailConfiguration mailConfiguration = new MailConfiguration();
        UserInterface userInterface = new UserInterface(new GmailMailService(mailConfiguration));
        userInterface.showMenu();
        userInterface.listen(scanner);

    }
}
