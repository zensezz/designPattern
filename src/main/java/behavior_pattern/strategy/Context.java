package behavior_pattern.strategy;

/**
 * @Author   zenghzong
 * @Since 2019/7/25
 * @Version 1.0
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.calc(num1, num2);
    }
}
