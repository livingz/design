package com.comp.designmodel.creational.factory.mothed;

/**
 * @author Zouwx
 * @create 2019-10-13 14:01
 * @desc iphone工厂类
 **/
public class IPhoneFactory extends FactoryMoble{
    @Override
    public Phone getFactory() {
        return new IPhone();
    }
}
