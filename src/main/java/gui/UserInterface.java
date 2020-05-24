package gui;

import mail.Email;
import mail.MailService;

import java.util.Scanner;

public class UserInterface {

    public static final String SPACE = "-------------------------------";
    private MailService mailService;

    public UserInterface(MailService mailService) {
        this.mailService = mailService;
    }

    public void showMenu(){
        System.out.println("Wiadomość w aplikacji Mailer");
        System.out.println(SPACE);
        System.out.println("Wybierz co chcesz zrobić:");
        System.out.println("1. Wyslij maila");
        System.out.println("2. Wyjście");
        System.out.println(SPACE);
    }

    public void listen(Scanner scanner) {
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Wybrana opcja 1");
                sendEmail(scanner);
                break;
            case 2:
                System.out.println("Wychodzą z programu");
                System.exit(0);
        }
    }

    private void sendEmail(Scanner scanner) {
        System.out.println("Podaje adres email na który wysłać:");
        String mail = scanner.next();
        System.out.println("Podaje temat wiadomości:");
        String subject = scanner.next();
        System.out.println("Podaj treść wiadomości:");
        String content = scanner.next();

        Email email = new Email(mail,subject,content);
        mailService.sendEmail(email);

    }
}
