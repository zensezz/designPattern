package other.interceptor;

import other.interceptor.IInterceptor;

import java.lang.reflect.Method;

/**
 * 自定义拦截器
 * @Author   zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class MyInterceptor implements IInterceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("before");
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("around");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("after");
    }
}
