package behavior_pattern.templatemethod;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public abstract class AbstractCalculator<T> {
    public final T calculate(T num1, T num2){
        return calc(num1, num2);
    }

    abstract public T calc(T num1, T num2);
}
