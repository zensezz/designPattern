package behavior_pattern.status;

/**
 * @Author   zenghzong
 * @Since 2019/7/26
 * @Version 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建状态上下文
        StateContext context = new StateContext();
        // 设置状态
        context.setState(new OnlineState());
        context.method();

        context.setState(new OffOnlineState());
        context.method();

    }
}
