package behavior_pattern.command;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class MyCommand implements ICommand {
    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action("mycommand");
    }
}
