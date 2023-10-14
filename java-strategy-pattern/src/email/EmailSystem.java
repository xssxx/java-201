package email;

import email.senders.Sender;

public class EmailSystem {
    public void sendEmail(Sender sender, Email m) {
        sender.sendEmail(m);
    }
}
