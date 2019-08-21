package behavior_pattern.strategy;

/**
 * @Author   zenghzong
 * @Since 2019/7/25
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 2));
    }
}
