package com.comp.designmodel.factory.mothed;

/**
 * @author Zouwx
 * @create 2019-10-13 12:15
 * @desc 工厂方法
 **/
public class textMain {

    public static void main(String[] args) {
        FactoryMoble iphoneF = new IPhoneFactory();
        Phone phone = iphoneF.getFactory();
        phone.getPhone();
    }
}
