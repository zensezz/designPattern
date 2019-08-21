package structure_pattern.flyweight;

import java.util.Random;

/**
 * @Author   zenghzong
 * @Since 2019/7/21
 * @Version 1.0
 */
public class Ticket {
    // 起点
    private String from;

    // 终点
    private String to;

    public Ticket(String from, String to){
        this.from = from;
        this.to = to;
    }

    public int getPrice(){
        return new Random().nextInt(200);
    }
}
