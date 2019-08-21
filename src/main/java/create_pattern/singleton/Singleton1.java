package create_pattern.singleton;


/**
 * 单例设计模式（饿汉式）
 * @Author   zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton1(){

    }


}
