package mail;

public class Email {

    private final String mailAdress;
    private final String subject;
    private final String content;
    private boolean isSent;

    public Email(String mailAdress, String subject, String content) {
        this.mailAdress = mailAdress;
        this.subject = subject;
        this.content = content;
        isSent = false;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }
}
