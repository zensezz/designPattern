package structure_pattern.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * jdk动态代理
 * @Author   zenghzong
 * @Since 2019/7/11
 * @Version 1.0
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    public JdkProxy(Object target){
        this.target = target;
    }

    /**
     * 建立代理对象和真实对象代理关系，并返回代理对象
     * @param target
     * @return
     */
    public static Object bind(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new JdkProxy(target));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }

    public static void main(String[] args) {
        IHelloWord helloWord = (IHelloWord)JdkProxy.bind(new HelloWord());
        helloWord.sayHello("jdk动态代理");
    }
}
