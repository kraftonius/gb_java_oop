package seminar5.Service;

import seminar5.Data.Mail;

public interface MailInterface {
    public String sendMail(Mail data);
    public void ReturnedMail();
    public void GetMail();
}
