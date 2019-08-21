package create_pattern.factory;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class MailSender implements ISender
{
    @Override
    public void send() {
        System.out.println("邮件发送");
    }
}
