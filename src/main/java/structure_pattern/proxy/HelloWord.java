package structure_pattern.proxy;


/**
 * @Author   zenghzong
 * @Since 2019/7/11
 * @Version 1.0
 */
public class HelloWord implements IHelloWord {

    @Override
    public void sayHello(String msg) {
        System.out.println("say:"+ msg);
    }
}
