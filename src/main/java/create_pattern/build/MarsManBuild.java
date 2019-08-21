package create_pattern.build;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class MarsManBuild implements IBuildHuman {

    private Human human;

    public MarsManBuild(){
        this.human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("奥特曼人的头");
    }

    @Override
    public void buildBody() {
        human.setBody("奥特曼的身体");
    }

    @Override
    public void buildHand() {
        human.setHand("奥特曼的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("奥特曼的腿");

    }

    @Override
    public Human createHuman() {
        return human;
    }
}
