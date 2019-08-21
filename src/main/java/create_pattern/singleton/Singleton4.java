package create_pattern.singleton;

import java.util.Objects;


/**
 * 单例设计模式(DCL双检查锁机制)
 * 加上volatile，DCL也就没什么优势了，废弃了：解决指令重排序
 * @Author   zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    public static Singleton4 getInstance(){
        // 第一次check
        if (Objects.isNull(instance)){
            //线程获取类锁
            synchronized (Singleton4.class){
                //第二次check
                if (Objects.isNull(instance)){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton4(){

    }


}
