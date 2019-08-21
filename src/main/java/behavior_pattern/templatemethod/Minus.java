package behavior_pattern.templatemethod;

import java.math.BigDecimal;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class Minus extends AbstractCalculator<Double> {

    @Override
    public Double calc(Double num1, Double num2) {
        BigDecimal b1 = new BigDecimal(num1.toString());
        BigDecimal b2 = new BigDecimal(num2.toString());
        return b1.subtract(b2).doubleValue();
    }
}
