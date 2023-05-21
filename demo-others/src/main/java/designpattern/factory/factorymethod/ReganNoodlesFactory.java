package designpattern.factory.factorymethod;

import designpattern.factory.noodles.INoodles;
import designpattern.factory.noodles.ReganNoodles;

/**
 * ClassName: ReganNoodlesFactory
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:54   @Version 1.0        描述
 */
public class ReganNoodlesFactory implements INoodlesFactory {
    @Override
    public INoodles createNoodles() {
        return new ReganNoodles();
    }
}
