package create_pattern.absfactory;

import create_pattern.factory.ISender;
import create_pattern.factory.SmsSender;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class SendSmsFactory implements AbstractSenderFactory {
    @Override
    public ISender sender() {
        return new SmsSender();
    }
}
