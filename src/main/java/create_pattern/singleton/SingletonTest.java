package create_pattern.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch来模拟并发，各个单例执行结果
 * @Author   zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class SingletonTest {
    private static int clientNum = 1000;
    private static int threadsNum = 10;

    // 计数器
    final static CountDownLatch doneSignal = new CountDownLatch(clientNum);

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(threadsNum);
        for (int i = 1; i <= clientNum; i++) {
            exec.execute(new MyRunable(i));
            // 计数器
            doneSignal.countDown();
        }
    }

    static class MyRunable implements Runnable{
        private int i;
        public MyRunable(int i){
            this.i = i;
        }
        @Override
        public void run() {
            try {
                // 阻塞线程，直到countDown调用clientNum才释放
                doneSignal.await();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(i+"：****："+Singleton4.getInstance());
        }
    }
}
