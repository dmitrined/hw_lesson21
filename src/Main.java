import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MailDeliveryService> mailDeliveryServiceList = new ArrayList<>();

        MailDeliveryService dhlService = new Dhl();
        MailDeliveryService emailService = new Email();
        MailDeliveryService pigeonService = new Pigeon();

        mailDeliveryServiceList.add(dhlService);
        mailDeliveryServiceList.add(emailService);
        mailDeliveryServiceList.add(pigeonService);

        sendMailAll(mailDeliveryServiceList);


    }

    public static void sendMailAll(List<MailDeliveryService> list) {
        for (MailDeliveryService mailDeliveryService : list) {
            mailDeliveryService.sendMail();
        }
    }
}