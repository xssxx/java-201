package email.senders;

import email.Email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SendSwitchCipher implements Sender {
    HashMap<String, List<Email>> mailboxes;

    public SendSwitchCipher() {
        mailboxes = new HashMap<>();
    }

    @Override
    public void sendEmail(Email m) {
        // encrypt
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length - 1; i += 2) {
            char tmp = data[i];
            data[i] = data[i + 1];
            data[i + 1] = tmp;
        }
        m.setText(new String(data));
        mailboxes.putIfAbsent(m.getRecipient(), new ArrayList<>());
        // deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
}
