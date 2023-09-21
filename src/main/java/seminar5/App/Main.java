package seminar5.App;

import seminar5.Controller.Controller;
import seminar5.Data.Mail;
import seminar5.MVP.HumanMailView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Mail mail = new Mail();
        mail = mail.generateNewMail();
        controller.start(mail);

    }
}
