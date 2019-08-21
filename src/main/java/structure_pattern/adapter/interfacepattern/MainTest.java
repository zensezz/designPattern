package structure_pattern.adapter.interfacepattern;

import structure_pattern.adapter.classpattern.Targetable;

/**
 * @Author   zenghzong
 * @Since 2019/8/3
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Targetable targetable1 = new Targetable1();
        Targetable targetable2 = new Targetable2();

        targetable1.method1();
        targetable2.method2();
    }
}
