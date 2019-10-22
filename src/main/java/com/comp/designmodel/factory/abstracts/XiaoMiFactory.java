package com.comp.designmodel.factory.abstracts;

/**
 * @author Zouwx
 * @create 2019-10-22 21:16
 * @desc 小米产品工厂，生产小米产品族工厂
 **/
public class XiaoMiFactory extends FactoryMobiler{
    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Headset getHeadset() {
        return new XiaoMiHeadset();
    }
}
