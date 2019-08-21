package create_pattern.factory;

/**
 * 短信发送
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class SmsSender implements ISender{
    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
