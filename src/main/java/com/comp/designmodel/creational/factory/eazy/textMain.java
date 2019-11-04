package com.comp.designmodel.creational.factory.eazy;

/**
 * @author Zouwx
 * @create 2019-10-13 12:15
 * @desc 简单工厂
 *
 * 又称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式（同属于创建型模式的还有工厂方法模式，抽象工厂模式，单例模式，建造者模式）。
 * 在简单工厂模式中，可以根据参数的不同返回不同类的实例。简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 * 客户端只知道传入工厂类的参数对于如何创建对象（逻辑）并不关心，所以说是将创建对象的逻辑给抽象了。
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
