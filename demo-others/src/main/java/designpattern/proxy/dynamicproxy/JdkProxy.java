package designpattern.proxy.dynamicproxy;

/**
 * ClassName: JdkProxy
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午3:27   @Version 1.0        描述
 */
public class JdkProxy {

    public static void main(String[] args) {

        IRentingHouse rentingHouse = new RentingHouseImpl(); // 被代理对象

        // 代理对象
        IRentingHouse jdkProxy = (IRentingHouse) ProxyFactory.getInstance().getJdkProxy(rentingHouse);

        jdkProxy.rentHouse();
    }
}
