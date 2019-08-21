package structure_pattern.bridge;

/**
 * @Author   zenghzong
 * @Since 2019/8/5
 * @Version 1.0
 */
public class SqlServerDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("sqlserver driver connect");
    }
}
