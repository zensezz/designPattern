package behavior_pattern.status;

/**
 * @Author   zenghzong
 * @Since 2019/7/26
 * @Version 1.0
 */
public class OffOnlineState extends AbstractQQState {

    @Override
    public void method() {
        System.out.println("QQ离线");
    }
}
