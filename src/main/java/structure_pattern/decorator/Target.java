package structure_pattern.decorator;

/**
 * @Author   zenghzong
 * @Since 2019/8/7
 * @Version 1.0
 */
public class Target implements Targetable {
    @Override
    public void method() {
        System.out.println("run method");
    }
}
