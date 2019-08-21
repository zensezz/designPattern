package behavior_pattern.mediator;

/**
 * @Author   zenghzong
 * @Since 2019/8/20
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        User a = new User("a");
        User b = new User("b");
        a.sendMsg("hello b");
        b.sendMsg("hello a");
    }
}
