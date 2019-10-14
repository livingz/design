package com.comp.designmodel.factory.eazy;

/**
 * @author Zouwx
 * @create 2019-10-13 12:15
 * @desc 简单工厂
 **/
public class textMain {

    public static void main(String[] args) {

        FactoryMoble factoryMoble = new FactoryMoble();
        Phone phone = factoryMoble.getPhone("IPhone");
        phone.getPhone();
        Phone phone2 = factoryMoble.getPhone("XiaoMi");
        phone2.getPhone();
        //反射实现测试
        Phone phone3 = factoryMoble.reflexPhone(IPhone.class);
        phone3.getPhone();
        Phone phone4 = factoryMoble.reflexPhone(XiaoMi.class);
        phone4.getPhone();

    }
}
