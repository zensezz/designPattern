package behavior_pattern.visitor;

/**
 * @Author   zenghzong
 * @Since 2019/7/20
 * @Version 1.0
 */
public interface ComputerPart {
    void accept(Visitor visitor);

    String getSubject();

}
