package behavior_pattern.command;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class Receiver {
    public void action(String command){
        System.out.println("接收到命令："+ command);
    }
}
