package designpattern.proxy.staticproxy;

/**
 * ClassName: Test
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午3:07   @Version 1.0        描述
 */
public class Test {

    public static void main(String[] args) {
        IRentingHouse rentingHouse = new RentingHouseImpl();
        // 自己租房
        // rentingHouse.rentHouse();

        // 通过中介租房
        RentingHouseProxy rentingHouseProxy = new RentingHouseProxy(rentingHouse);
        rentingHouseProxy.rentHouse();
    }
}
