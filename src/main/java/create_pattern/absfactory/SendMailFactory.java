package create_pattern.absfactory;

import create_pattern.factory.ISender;
import create_pattern.factory.MailSender;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class SendMailFactory implements AbstractSenderFactory {
    @Override
    public ISender sender() {
        return new MailSender();
    }
}
