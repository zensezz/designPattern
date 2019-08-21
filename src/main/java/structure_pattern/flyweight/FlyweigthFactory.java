package structure_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class FlyweigthFactory {
    // 池容器
    private static Map<String, Ticket> pool = new HashMap<String, Ticket>();

    // 享元工厂
    public static Ticket getFlyweigth(String from, String to){
        String key = from + "-" + to;
        Ticket ticket = pool.get(key);
        if (ticket != null) {
            return ticket;
        }
        ticket = new Ticket(from, to);
        pool.put(key, ticket);
        return ticket;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Ticket ticket = FlyweigthFactory.getFlyweigth("广州", "深圳");
            System.out.println(ticket);
        }
    }
}
