package behavior_pattern.observer;



/**
 * @Author   zenghzong
 * @Since 2019/8/1
 * @Version 1.0
 */
public class ObserverService1 implements Observer {

    // 观察者状态
    private String observerState;

    @Override
    public void update(String newState) {
        this.observerState = newState;
        System.out.println("接收到消息，发布到 1 商城" + newState);
    }
}
