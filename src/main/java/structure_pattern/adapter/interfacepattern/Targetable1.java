package structure_pattern.adapter.interfacepattern;

/**
 * @Author   zenghzong
 * @Since 2019/8/3
 * @Version 1.0
 */
public class Targetable1 extends Wrapper {
    @Override
    public void method1() {
        System.out.println("this is Targetable1 method1");
    }
}
