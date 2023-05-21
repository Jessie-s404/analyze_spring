package designpattern.factory.noodles;

/**
 * ClassName: LzNoodles
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:38   @Version 1.0        描述
 */
public class LzNoodles implements INoodles {
    @Override
    public void desc() {
        System.out.println("兰州拉面，兰州特色小吃");
    }
}
