package other.interceptor;

import java.lang.reflect.Method;

/**
 * 拦截器模式
 * @Author   zenghzong
 * @Since 2019/7/7
 * @Version 1.0
 */
public interface IInterceptor {
    /**
     *
     * @param proxy   代理对象
     * @param target  真实对象
     * @param method  method方法
     * @param args    运行方法参数
     * @return        为false调用around方法 -> after
     */
    public boolean before(Object proxy, Object target, Method method, Object[] args);

    public void around(Object proxy, Object target, Method method, Object[] args);

    public void after(Object proxy, Object target, Method method, Object[] args);
}
