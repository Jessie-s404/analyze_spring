package designpattern.factory;

import designpattern.factory.noodles.INoodles;
import designpattern.factory.noodles.LzNoodles;
import designpattern.factory.noodles.PaoNoodles;
import designpattern.factory.noodles.ReganNoodles;

/**
 * ClassName: SimpleNoodlesFactory
 * Description: 简单工厂模式
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:42   @Version 1.0        描述
 */
public class SimpleNoodlesFactory {

    public static final int TYPE_LZ = 1;//兰州拉面
    public static final int TYPE_PM = 2;//泡面
    public static final int TYPE_RG = 3;//热干面

    public static INoodles createNoodles(int type) {
        switch (type) {
            case 1:
                return new LzNoodles();
            case 2:
                return new PaoNoodles();
            case 3:
                return new ReganNoodles();
            default:
                return new LzNoodles();
        }
    }
}
