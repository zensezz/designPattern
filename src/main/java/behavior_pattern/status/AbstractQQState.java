package behavior_pattern.status;

/**
 *  状态抽象体
 * @Author   zenghzong
 * @Since 2019/7/26
 * @Version 1.0
 */
public abstract class AbstractQQState {
    // 上下文环境
    protected StateContext stateContext;

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public abstract void method();

}
