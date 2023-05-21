package designpattern.factory.noodles;

/**
 * ClassName: ReganNoodles
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:40   @Version 1.0        描述
 */
public class ReganNoodles implements INoodles {
    @Override
    public void desc() {
        System.out.println("红油热干面，武汉特色小吃");
    }
}
