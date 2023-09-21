package seminar5.Controller;

import seminar5.Data.Mail;
import seminar5.MVP.HumanMailView;
import seminar5.Service.MailService;

public class Controller {
    MailService mailService = new MailService();
    HumanMailView humanMailView = new HumanMailView();

    public void start(Mail data) {
        String qwe = mailService.sendMail(data);
        humanMailView.GetMail(qwe);
    }
}
