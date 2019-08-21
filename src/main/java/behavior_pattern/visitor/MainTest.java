package behavior_pattern.visitor;

/**
 * @Author   zenghzong
 * @Since 2019/7/20
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        // 主体
        ComputerPart mouse = new Mouse();
        ComputerPart keyboard = new Keyboard();

        // 访问者
        Visitor visitor = new Visitor();

        mouse.accept(visitor);
        keyboard.accept(visitor);
    }
}
