package designpattern.factory.factorymethod;

import designpattern.factory.noodles.INoodles;
import designpattern.factory.noodles.PaoNoodles;

/**
 * ClassName: PaoNoodlesFactory
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:53   @Version 1.0        描述
 */
public class PaoNoodlesFactory implements INoodlesFactory{
    @Override
    public INoodles createNoodles() {
        return new PaoNoodles();
    }
}
