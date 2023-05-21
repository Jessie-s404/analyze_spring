package designpattern.factory.factorymethod;

import designpattern.factory.noodles.INoodles;

/**
 * ClassName: Test
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:55   @Version 1.0        描述
 */
public class Test {
    public static void main(String[] args) {
        INoodlesFactory noodlesFactory = new LzNoodlesFactory();
        INoodles noodles = noodlesFactory.createNoodles();
        noodles.desc();
    }
}
