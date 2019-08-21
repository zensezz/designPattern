package behavior_pattern.interpreter;

/**
 * 解释器模式
 *  一般主要应用在OOP【object oriented programming】开发中的编译器的开发中，所以适用面比较窄
 *
 * @Author   zenghzong
 * @Since 2019/8/11
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setNum1(10);
        context.setNum2(5);
        Expression expression = new Minus();
        int result = expression.interpreter(context);
        System.out.println(result);
    }
}
