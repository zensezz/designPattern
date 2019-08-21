package create_pattern.singleton;

import java.util.Objects;

/**
 * 单例设计模式（懒汉式）
 *
 * @Author   zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    public static Singleton2 getInstance(){
        if (Objects.isNull(instance)){
            instance = new Singleton2();
        }
        return instance;
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton2(){

    }


}
