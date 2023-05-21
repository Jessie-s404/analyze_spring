package designpattern.factory.factorymethod;

import designpattern.factory.noodles.INoodles;

/**
 * ClassName: INoodlesFactory
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:51   @Version 1.0        描述
 */
public interface INoodlesFactory {
    INoodles createNoodles();
}
