package behavior_pattern.status;

/**
 * @Author   zenghzong
 * @Since 2019/7/26
 * @Version 1.0
 */
public class StateContext {
    private AbstractQQState state;

    public AbstractQQState getState() {
        return state;
    }

    public void setState(AbstractQQState state) {
        this.state = state;
    }

    public void method(){
        state.method();
    }
}
