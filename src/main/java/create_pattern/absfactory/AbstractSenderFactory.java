package create_pattern.absfactory;

import create_pattern.factory.ISender;

/**
 * 抽象工厂
 * @Author   zenghzong
 * @Since 2019/7/24
 * @Version 1.0
 */
public interface AbstractSenderFactory {
    public ISender sender();
}
