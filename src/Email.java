public class Email implements MailDeliveryService {
    public void sendMail() {
        System.out.println("Отправить по Интернету");
    }

    public String serviceTitle() {
        return "Email";
    }
}
