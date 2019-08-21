package behavior_pattern.visitor;

/**
 * @Author   zenghzong
 * @Since 2019/7/20
 * @Version 1.0
 */
public class Visitor {
    public void visit(ComputerPart part){
        System.out.println("访问者行为："+part.getSubject());
    }
}
