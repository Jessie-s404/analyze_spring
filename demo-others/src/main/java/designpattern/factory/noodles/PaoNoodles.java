package designpattern.factory.noodles;

/**
 * ClassName: PaoNoodles
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:39   @Version 1.0        描述
 */
public class PaoNoodles implements INoodles {
    @Override
    public void desc() {
        System.out.println("泡面，程序员必备");
    }
}
