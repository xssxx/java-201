package email;

import email.senders.SendCaesar;
import email.senders.SendSwitchCipher;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");
        EmailSystem emailSystem = new EmailSystem();
        emailSystem.sendEmail(new SendCaesar(2), email1);
        emailSystem.sendEmail(new SendSwitchCipher(), email2);
    }
}
