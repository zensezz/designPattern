package structure_pattern.adapter.classpattern;

/**
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示
 * @Author   zenghzong
 * @Since 2019/8/3
 * @Version 1.0
 */
public class Source {
    public void method1(){
        System.out.println("this is original method1");
    }
}
