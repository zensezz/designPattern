package behavior_pattern.visitor;

/**
 * @Author   zenghzong
 * @Since 2019/7/20
 * @Version 1.0
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "keyboard";
    }
}
