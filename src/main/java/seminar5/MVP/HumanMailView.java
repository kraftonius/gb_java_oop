package seminar5.MVP;

public class HumanMailView implements View{
    @Override
    public void ReturnMail() {
        System.out.println("Возвращено");
    }

    @Override
    public void SendMail() {
        System.out.println("Отправлено");
    }

    @Override
    public void GetMail(String data) {
        System.out.println("Получено");

    }

    @Override
    public void TalkWithPostman() {
        System.out.println("Говори");

    }
}
