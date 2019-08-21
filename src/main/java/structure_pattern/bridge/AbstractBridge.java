package structure_pattern.bridge;

/**
 * 桥
 * @Author   zenghzong
 * @Since 2019/8/5
 * @Version 1.0
 */
public abstract class AbstractBridge {
    private Driver driver;

    public void connect(){
        driver.connect();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
