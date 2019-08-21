package create_pattern.factory;

/**
 *  静态工厂模式
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class StaticSenderFactory {
    public static ISender senderMail(){
        return new MailSender();
    }

    public static ISender senderSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        StaticSenderFactory.senderMail().send();
        StaticSenderFactory.senderSms().send();
    }
}
