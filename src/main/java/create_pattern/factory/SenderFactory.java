package create_pattern.factory;

/**
 * 工厂模式
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class SenderFactory {
    public ISender senderMail(){
        return new MailSender();
    }

    public ISender senderSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        ISender sender = factory.senderSms();
        sender.send();
    }
}
