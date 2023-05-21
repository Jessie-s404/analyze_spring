package designpattern.proxy.staticproxy;

/**
 * ClassName: RentingHouseProxy
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午3:04   @Version 1.0        描述
 */
public class RentingHouseProxy implements IRentingHouse {

    private IRentingHouse rentingHouse;

    public RentingHouseProxy(IRentingHouse rentingHouse) {
        this.rentingHouse = rentingHouse;
    }

    @Override
    public void rentHouse() {
        System.out.println("中介（代理）收取服务费3000元");
        rentingHouse.rentHouse();
        System.out.println("客户信息卖了3毛钱");
    }
}
