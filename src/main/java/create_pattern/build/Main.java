package create_pattern.build;

/**
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        IBuildHuman buildHuman = new MarsManBuild();
        Human human = director.createHumanByDirector(buildHuman);
        System.out.println(human.toString());
    }
}
