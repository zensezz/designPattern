package behavior_pattern.observer;

/**
 * @Author   zenghzong
 * @Since 2019/8/1
 * @Version 1.0
 */
public class GoodSubject extends Subject {
    private String state;

    public void publish(String newState){
        this.state = newState;
        notifyAllObserve(newState);
    }

    public static void main(String[] args) {
        // 创建被观察对象
        Subject subject = new GoodSubject();
        // 注入观察者
        subject.register(new ObserverService1());
        subject.register(new ObserverService2());
        // 发布商品
        ((GoodSubject) subject).publish("华为p30");
    }
}
