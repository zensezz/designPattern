package structure_pattern.bridge;

/**
 * @Author   zenghzong
 * @Since 2019/8/5
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        // 驱动
        Driver mysqlDriver = new MysqlDriver();
        Driver sqlServerDriver = new SqlServerDriver();
        Driver oracleDriver = new OracleDriver();

        // 桥梁
        AbstractBridge bridge = new MyBridge();
        bridge.setDriver(mysqlDriver);
        bridge.connect();

        bridge.setDriver(sqlServerDriver);
        bridge.connect();

        bridge.setDriver(oracleDriver);
        bridge.connect();
    }
}
