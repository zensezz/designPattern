package behavior_pattern.command;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class Invoker {
    private ICommand command;

    public Invoker(ICommand command){
        this.command = command;
    }

    public void action(){
        command.exec();
    }

    public static void main(String[] args) {
        // 创建命令
        ICommand cmd = new MyCommand(new Receiver());
        // 创建执行者
        Invoker invoker = new Invoker(cmd);
        // 调用
        invoker.action();
    }
}
