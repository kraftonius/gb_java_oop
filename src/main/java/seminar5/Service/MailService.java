package seminar5.Service;

import seminar5.Data.Mail;

public class MailService implements MailInterface{
    @Override
    public String sendMail(Mail data) {
        //System.out.println("Отправлено");
        return "Письмо " + data + " отправлено";
    }

    @Override
    public void ReturnedMail() {
        System.out.println("Возврат");

    }

    @Override
    public void GetMail() {
        System.out.println("Получено");
    }
}
