package behavior_pattern.responsibility;

/**
 * @Author   zenghzong
 * @Since 2019/7/26
 * @Version 1.0
 */
public class ConsoleHandler extends Handler {

    @Override
    protected void log(String msg) {
        LevelEnum levelEnum = getLevel();
        System.out.println( levelEnum.getName() +":  "+ msg);
    }
}
