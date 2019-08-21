package create_pattern.build;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public interface IBuildHuman {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();

    public Human createHuman();
}
