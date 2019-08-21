package behavior_pattern.templatemethod;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class Plus extends AbstractCalculator<Integer> {


    @Override
    public Integer calc(Integer num1, Integer num2) {
        return java.lang.Integer.valueOf((int)num1 + (int)num2);
    }
}
