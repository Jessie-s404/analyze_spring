package designpattern.factory.factorymethod;

import designpattern.factory.noodles.INoodles;
import designpattern.factory.noodles.LzNoodles;

/**
 * ClassName: LzNoodlesFactory
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:52   @Version 1.0        描述
 */
public class LzNoodlesFactory implements INoodlesFactory {
    @Override
    public INoodles createNoodles() {
        return new LzNoodles();
    }
}
