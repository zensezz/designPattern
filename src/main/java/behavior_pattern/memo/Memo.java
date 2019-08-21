package behavior_pattern.memo;

/**
 * 备忘录
 * @Author   zenghzong
 * @Since 2019/8/20
 * @Version 1.0
 */
public class Memo {
    private String value;

    public Memo(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
