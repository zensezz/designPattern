package behavior_pattern.responsibility;

/**
 * @Author   zenghzong
 * @Since 2019/7/26
 * @Version 1.0
 */
public enum LevelEnum {
    INFO(1,"INFO"),
    DEBUG(2,"DEBUG"),
    WARN(3,"WARN"),
    ERROR(4,"ERROR")
    ;

    public static LevelEnum getInstanceByLevel(int level){
        for (LevelEnum value : LevelEnum.values()) {
            if (value.getLevel() == level){
                return value;
            }
        }
        return null;
    }

    LevelEnum(int level, String name){
        this.level = level;
        this.name = name;
    }

    private int level;
    private String name;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
