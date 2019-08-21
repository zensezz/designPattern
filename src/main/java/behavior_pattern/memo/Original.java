package behavior_pattern.memo;

/**
 * 备忘录
 * @Author   zenghzong
 * @Since 2019/8/20
 * @Version 1.0
 */
public class Original {
    private String value;

    public Original(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memo createMemo(){
        return new Memo(value);
    }

    public void rollback(Memo memo){
        this.value = memo.getValue();
    }
}
