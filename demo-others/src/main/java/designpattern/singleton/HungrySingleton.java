package designpattern.singleton;

/**
 * ClassName: HungrySingleton
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午3:31   @Version 1.0        描述
 */
public class HungrySingleton {

    // 1. 私有化构造方法
    private HungrySingleton() {}

    // 2. 创建类的唯一实例
    private static final HungrySingleton instance = new HungrySingleton();

    // 3. 提供一个获取实例的方法
    public static HungrySingleton getInstance() {
        return instance;
    }
}
