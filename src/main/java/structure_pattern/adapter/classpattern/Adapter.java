package structure_pattern.adapter.classpattern;

/**
 * 类的适配器
 * @Author   zenghzong
 * @Since 2019/8/3
 * @Version 1.0
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();

        targetable.method2();
    }
}
