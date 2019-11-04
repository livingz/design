package com.comp.designmodel.creational.factory.mothed;

/**
 * @author Zouwx
 * @create 2019-10-13 14:02
 * @desc
 **/
public class XiaoMiFactory extends FactoryMoble{

    @Override
    public Phone getFactory() {
        return new XiaoMi();
    }
}
