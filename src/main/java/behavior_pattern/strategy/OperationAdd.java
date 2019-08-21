package behavior_pattern.strategy;

/**
 * @Author   zenghzong
 * @Since 2019/7/25
 * @Version 1.0
 */
public class OperationAdd implements IStrategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
