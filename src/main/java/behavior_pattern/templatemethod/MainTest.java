package behavior_pattern.templatemethod;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        // 加法
        AbstractCalculator<Integer> calculator = new Plus();
        System.out.println(calculator.calculate(1, 2));

        // 减法
        AbstractCalculator<Double> calculator1 = new Minus();
        System.out.println(calculator1.calculate(2.05, 1.9));
    }
}
