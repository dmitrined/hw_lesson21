import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер способа отправки письма:");
        System.out.println("1. DHL");
        System.out.println("2. Email");
        System.out.println("3. Почтовый голубь");
        String dhl = "1";
        String email = "2";
        String pigeon = "3";
        String text = "Ок! Вы выбрали способ отправки: ";
        String result = scanner.nextLine();
        if (result.equals(dhl)) {
            System.out.println(text + dhlService.serviceTitle());
            dhlService.sendMail();
        }
        if (result.equals(email)) {
            System.out.println(text + emailService.serviceTitle());
            emailService.sendMail();
        }

        if (result.equals(pigeon)) {
            System.out.println(text + pigeonService.serviceTitle());
            pigeonService.sendMail();
        }

    }

    public static void sendMailAll(List<MailDeliveryService> list) {
        for (MailDeliveryService mailDeliveryService : list) {
            mailDeliveryService.sendMail();
        }
    }

}