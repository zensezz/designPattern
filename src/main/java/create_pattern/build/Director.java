package create_pattern.build;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class Director {
    public Human createHumanByDirector(IBuildHuman buildHuman){
        buildHuman.buildHead();
        buildHuman.buildBody();
        buildHuman.buildHand();
        buildHuman.buildFoot();
        return buildHuman.createHuman();
    }
}
