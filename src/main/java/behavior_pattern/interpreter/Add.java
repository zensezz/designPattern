package behavior_pattern.interpreter;

/**
 * @Author   zenghzong
 * @Since 2019/8/11
 * @Version 1.0
 */
public class Add implements Expression {
    @Override
    public int interpreter(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
