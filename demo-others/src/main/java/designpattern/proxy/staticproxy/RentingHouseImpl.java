package designpattern.proxy.staticproxy;

/**
 * ClassName: RentingHouseImpl
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午3:03   @Version 1.0        描述
 */
public class RentingHouseImpl implements IRentingHouse {
    @Override
    public void rentHouse() {
        System.out.println("我要租房");
    }
}
