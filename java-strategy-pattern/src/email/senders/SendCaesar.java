package email.senders;

import email.Email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SendCaesar implements Sender {
    private HashMap<String, List<Email>> mailboxes;
    private int key;

    public SendCaesar(int key) {
        this.key = key;
        mailboxes = new HashMap<>();
    }
    @Override
    public void sendEmail(Email m) {
        // encrypt
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        m.setText(new String(data));
        mailboxes.putIfAbsent(m.getRecipient(), new ArrayList<>());
        // deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
}
